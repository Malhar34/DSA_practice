class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for (String word : strs) { 
            char[] chars = word.toCharArray(); // converts the words to characters
            Arrays.sort(chars); // sorts them alphabetically
            String key = new String(chars); // rebuilds a string, Ex. makes hat > aht
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>()); 
            } 
            map.get(key).add(word); // adds the word to the HashMaps list
        }
        return new ArrayList<>(map.values()); // turns the values of the Map into an ArrayList thats allowed to be returned
    }
}
