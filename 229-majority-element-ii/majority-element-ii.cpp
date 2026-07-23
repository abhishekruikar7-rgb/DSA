class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        unordered_map<int,int> mp;
        vector<int> ans;
        for(int i : nums){
            mp[i]++;
        }
        int n = nums.size()/3;
        for(int i = 0;i < nums.size();i++){
            if(mp[nums[i]] > n){
                ans.push_back(nums[i]);
                mp[nums[i]] = 0;
            }
        }
        return ans;
    }
};