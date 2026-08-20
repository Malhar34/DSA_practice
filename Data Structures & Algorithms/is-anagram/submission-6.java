class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> stringS = new HashMap<>();
        HashMap<Character, Integer> stringT = new HashMap<>();
            for (char c : s.toCharArray()) {
                stringS.put(c, stringS.getOrDefault(c, 0) + 1);
            } 
            for (char c : t.toCharArray()) {
                stringT.put(c, stringT.getOrDefault(c, 0) + 1);
            }       
            return stringS.equals(stringT);
    }
}

