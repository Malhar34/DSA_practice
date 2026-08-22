class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String string : strs) {
            sb.append(string.length()).append("#").append(string);
        }
        String str = sb.toString(); // Converts back to a String
        return str;
    }

    public List<String> decode(String str) {
        ArrayList<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#'){
                j++;
            }
            String strnum = str.substring(i, j); // gives "3" 
            int num = Integer.parseInt(strnum); // gives 3 
            String word = str.substring(j + 1, num + 1 + j);
            result.add(word);
            i = num + 1 + j;
        }
        return result;
    }
}

