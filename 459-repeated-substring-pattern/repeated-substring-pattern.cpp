class Solution {
public:
    bool repeatedSubstringPattern(string s) {
        string t = s+s;
        string ans = t.substr(1,t.size()-2);
        if(ans.find(s) != string::npos){
            return true;
        }
        return false;

        
        
    }
};