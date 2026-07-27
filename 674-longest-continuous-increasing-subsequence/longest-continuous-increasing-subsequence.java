class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int l = 0;
        int r = 0;
        int lon = 1;
        while(r < nums.length-1){
            
            if(nums[r+1] > nums[r]){
                r++;
                lon = Math.max(lon,r-l+1);
            }
            else{
                r++;
                l = r;
            }
        }
        return lon;
    }
}