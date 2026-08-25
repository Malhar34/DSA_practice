class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int longest = 0;
        for (int num : nums) {
            set.add(num);
        }
        for (int num : set) {
            if (set.contains(num - 1)) {
                continue; // this statement makes sure the code only walks on the lowest number in a series if 1 is there when your on 2 you know you could do 1,2. Also keeps O(n)
            } else {
                int length = 1;
                int current = num;
                while (set.contains(current + 1)){
                    length++;
                    current++;
                }
                longest = Math.max(longest, length); // makes sure longest gets updated to be the greatest length each time.
            }
        }
        return longest;
    }
}
