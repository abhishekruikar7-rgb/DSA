class Solution {
    boolean alphanum(char ch){
        if(Character.toLowerCase(ch) >= 'a' && Character.toLowerCase(ch) <= 'z' || ch >= '0' && ch <= '9'){
            return true;
        }
        return false;
    }
    public boolean isPalindrome(String s) {
        int st = 0;
        int end = s.length()-1;
        while(st < end){
            if(!alphanum(s.charAt(st))){
                st++;
                continue;
            }
            if(!alphanum(s.charAt(end))){
                end--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(st)) != Character.toLowerCase(s.charAt(end))){
                return false;
            }
            st++;
            end--;
        }
        return true;        
    }
}