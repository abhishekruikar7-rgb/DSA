public class Solution {
    public string RemoveOuterParentheses(string s) {
        string ans = "";
        int i = 0;
        int c = 0;
        while(i < s.Length){
            if(s[i] == ')'){
                c--;
            }
            if(c != 0){
                ans = ans + s[i];
            }
            if(s[i] == '('){
                c++;
            }
            i++;

        } 
        return ans;

    }
}

