class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        vector<pair<int,int>> ans;
        unordered_map<int,int> mp;
        for(int i : nums){
            mp[i]++;
        }
        for(int i = 0;i < nums.size();i++){
            ans.push_back({mp[nums[i]],nums[i]});
            mp[nums[i]] = 0;
        }
        sort(ans.begin(),ans.end());
        reverse(ans.begin(),ans.end());
        vector<int> result;
        for(int i = 0;i < k;i++){
            result.push_back(ans[i].second);
        }
        return result;
    }
};