class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> result = new ArrayList<>();
        for (int num = 0; num < nums.length; num++) {
            if (num > 0 && nums[num] == nums[num - 1]) { // skips duplicates
                continue;
            }
            int left = num + 1;
            int right = nums.length - 1;
            while (left < right){
                int sum = nums[num] + nums[left] + nums[right];
                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    result.add(Arrays.asList(nums[num], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                }
            }
        }
        return result;
    }
}
