class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String i : strs) { 
            sb.append(i.length()).append("#").append(i); // builds "3#cat"
        }
        String str = sb.toString();
        return str;
    }

    public List<String> decode(String str) {
        ArrayList<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while(str.charAt(j) != '#') {
                j++;
            }
            String len = str.substring(i, j); // gives "3"
            int num = Integer.parseInt(len); // gives 3
            String word = str.substring(j + 1, j + num + 1);
            result.add(word);
            i = j + num + 1;
        }
        return result;
    }
}

