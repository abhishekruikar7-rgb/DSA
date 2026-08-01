class Solution {
public:
    string restoreString(string s, vector<int>& indices) {
        vector<pair<int,int>> ans;

        for(int i = 0;i < indices.size();i++){
            ans.push_back({indices[i],s[i]});
        }
        sort(ans.begin(),ans.end());
        string a = "";
        for(int i = 0;i < ans.size();i++){
            a.push_back(ans[i].second);
        }
        return a;
    }
};