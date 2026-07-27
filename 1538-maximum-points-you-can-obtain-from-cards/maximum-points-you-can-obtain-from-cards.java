class Solution {
    public int maxScore(int[] nums, int k) {
        int st = 0;
        for(int i = 0;i < k;i++){
            st = st + nums[i];
        }
        int ans = 0;
        ans = st;
        for(int i = 0;i < k;i++){
            st = st - nums[k-i-1];
            st = st + nums[nums.length-i-1];
            ans = Math.max(ans,st);
        }
        return ans;
    }
}