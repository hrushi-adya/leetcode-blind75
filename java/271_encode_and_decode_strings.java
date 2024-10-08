class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodeString = new StringBuilder();
        for(String s: strs) {
            encodeString.append(s.length()).append("#").append(s);
        }
        return encodeString.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i=0;
        while(i<str.length()) {
            int j = i;
            while(str.charAt(j) != ('#')) j++;
           
            int len = Integer.valueOf(str.substring(i,j));
            i = j+1+len;
            list.add(str.substring(j+1, i));
        }   
        return list;
    }
}
