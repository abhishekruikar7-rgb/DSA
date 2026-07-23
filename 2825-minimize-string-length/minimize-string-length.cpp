class Solution {
public:
    int minimizedStringLength(string s) {
        unordered_map<char,int> mp;
        int c = 0;
        for(int i : s){
            mp[i]++;
        }
        for(int i : s){
            if(mp[i] > 0){
                c++;
                mp[i] = 0;
            }
        }
        return c;
    }
};