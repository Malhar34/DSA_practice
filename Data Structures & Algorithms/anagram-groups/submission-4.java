class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for (String i : strs) { 
            char[] chars = i.toCharArray(); // converts the words to characters
            Arrays.sort(chars); // sorts them alphabetically
            String key = new String(chars); // rebuilds a string, makes hat > aht
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            } 
            map.get(key).add(i);
        }
        return new ArrayList<>(map.values());
    }
}
