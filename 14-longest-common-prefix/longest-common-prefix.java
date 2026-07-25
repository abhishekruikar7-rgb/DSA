class Solution {
    public String longestCommonPrefix(String[] s) {
        String ans = "";
        Arrays.sort(s);
        int i = 0;
        while(i < s[0].length() && s[0].charAt(i) == s[s.length - 1].charAt(i)) {
            ans = ans + s[0].charAt(i);
            i++;
        }
        return ans;
    }
}