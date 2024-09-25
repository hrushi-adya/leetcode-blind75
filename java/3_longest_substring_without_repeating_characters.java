class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hashSet = new HashSet<>();
        int l = 0;
        int result = 0;

        for(int i=0; i<s.length(); i++) {
            while(hashSet.contains(s.charAt(i))) {
                hashSet.remove(s.charAt(l));
                l++;
            }
            hashSet.add(s.charAt(i));
            result = Math.max(result, i-l+1);
        }
        return result;
    }
}
