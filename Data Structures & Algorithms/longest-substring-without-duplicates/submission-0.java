class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < s.length(); right++) { // make the second pointer
            char c = s.charAt(right);
            while (set.contains(c)) { 
                set.remove(s.charAt(left)); // if you keep removing eventually the while loop will be untrue, 
                left++;
            }
            set.add(c);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
