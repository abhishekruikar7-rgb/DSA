class Solution {
    public int maxArea(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int water = 0;
        int maxi = 0;
        while(l < r){
            if(nums[l] <= nums[r]){
                int h = nums[l];
                int b = r-l;
                water = h*b;
                maxi = Math.max(maxi,water);
                l++;
            }
            else{
                int h = nums[r];
                int b = r-l;
                water = h*b;
                maxi = Math.max(maxi,water);
                r--;
            }
        }
        return maxi;
    }
}