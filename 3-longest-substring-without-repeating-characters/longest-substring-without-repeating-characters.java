class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> st = new HashSet<>();
        int maxi = 0;
        int l = 0;
        for(int r = 0;r < s.length();r++){
            while(st.contains(s.charAt(r))){
                st.remove(s.charAt(l));
                l++;
            }
            st.add(s.charAt(r));
            maxi = Math.max(maxi,r-l+1);
        }
        return maxi;
    }
}