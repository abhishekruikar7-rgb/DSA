class Solution {
public:
    bool vowels(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }
        return false;
    }

    string sortVowels(string s) {
        string v = "";
        for(int i = 0;i < s.size();i++){
            if(vowels(s[i])){
                v.push_back(s[i]);
            }
        }      
        sort(v.begin(),v.end());
        int idx = 0;
        string ans = "";
        for(int i = 0;i < s.size();i++){
            if(vowels(s[i])){
                ans.push_back(v[idx]);
                idx++;
            }
            else{
                ans.push_back(s[i]);
            }
        }
        return ans;

    }
};