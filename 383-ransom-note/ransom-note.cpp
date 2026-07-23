class Solution {
public:
    bool canConstruct(string s, string t) {
        unordered_map<char,int> mp;

        for(int i : t){
            mp[i]++;
        }

        for(int i = 0;i < s.size();i++){
            if(mp[s[i]] == 0){
                return false;
            }
            mp[s[i]]--;
        }
        return true;
        

    }
};