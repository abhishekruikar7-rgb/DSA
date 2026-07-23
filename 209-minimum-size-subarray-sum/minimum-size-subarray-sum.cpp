class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int win = 0;
        int l = 0;
        int mini = INT_MAX;
        for(int r = 0;r < nums.size();r++){
            win = win + nums[r];
            while(win >= target){
                mini = min(mini,r-l+1);

                win = win - nums[l];
                l++;
            }
        }
        if(mini == INT_MAX){
            return 0;
        }
        else{
            return mini;
        }
    }
};