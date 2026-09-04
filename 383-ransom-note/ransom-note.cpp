class Solution {
public:
    bool canConstruct(string r, string m) {
        unordered_map<char,int> mp;
        for(int i : m){
            mp[i]++;
        }
        for(int i = 0;i < r.size();i++){
            if(mp[r[i]] > 0){
                mp[r[i]]--;
            }
            else{
                return false;
            }
            
        }
        return true;
    }
};