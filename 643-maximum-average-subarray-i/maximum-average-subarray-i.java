class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double maxi = 0;
        for(int i = 0;i < k;i++){
            sum = sum + nums[i];
        }
        maxi = sum;
        for(int i = 1;i <= nums.length-k;i++){
            sum = sum - nums[i-1] + nums[i+k-1];
            if(sum > maxi){
                maxi = sum;
            }
        }
        return maxi/k; 
    }
}