class Solution {
    public boolean isvowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
        ch == 'A' || ch == 'E' || ch == 'O' ||ch == 'I' ||ch == 'U'){
            return true;
        }
        return false;
    }


    public String sortVowels(String s) {
        StringBuilder v = new StringBuilder();
        StringBuilder ans = new StringBuilder();

        for(int i = 0;i < s.length();i++){
            if(isvowel(s.charAt(i))){
                v.append(s.charAt(i));
            }
        }
        char[] vo = v.toString().toCharArray();
        Arrays.sort(vo);
        int idx = 0;
        for(int i = 0;i < s.length();i++){
            if(isvowel(s.charAt(i))){
                ans.append(vo[idx]);
                idx++;
            }
            else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
        
    }
}