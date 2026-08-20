class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // 7 - 4 = 3 // 7 - 3 = 4
            if (!map.containsKey(complement)) {
                map.put(nums[i], i);
            } else { // Ex. you need 4 and the map has (4,0)
                return new int[]{map.get(complement), i}; // gets indices
            }
        }
        return new int[]{};
    }
}
