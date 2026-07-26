class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double res = 0;
        double maxi = 0;
        for(int i = 0;i < k;i++){
            res = res + nums[i];
        } 
        maxi = res;
        for(int i = 1;i <= nums.length-k;i++){
            res = res - nums[i-1] + nums[i+k-1];

            if(res > maxi){
                maxi = res;
            }
        }
        return maxi/k;
    }
}