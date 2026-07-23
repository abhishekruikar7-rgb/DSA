class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        unordered_map<int,int> mp,m;
        
        for(int i : arr){
            mp[i]++;
        }
        for(auto f : mp){
            m[f.second]++;
        }
        
        for(int i = 0;i < arr.size()-1;i++){
            if(m[mp[arr[i]]] > 1){
                return false;
            }

        }
        return true;
    }
};