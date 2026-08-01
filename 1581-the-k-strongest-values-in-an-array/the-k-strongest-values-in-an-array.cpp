class Solution {
public:
    vector<int> getStrongest(vector<int>& arr, int k) {
        sort(arr.begin(),arr.end());
        vector<pair<int,int>> ans;
        
        int mid = arr[(arr.size()-1)/2];
        for(int i = 0;i < arr.size();i++){
            int diff = abs(arr[i]-mid);

            ans.push_back({diff,arr[i]});
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