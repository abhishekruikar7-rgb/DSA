class Solution {
    public int maxProfit(int[] nums) {
        int mini = nums[0];
        int maxi = 0;

        for(int i = 1;i < nums.length;i++){
            if(nums[i] > mini){
                maxi += nums[i] - mini;
            }
            mini = nums[i];
        }
        return maxi;
    }
}