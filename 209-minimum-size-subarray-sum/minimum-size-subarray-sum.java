class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int mini = Integer.MAX_VALUE;
        int win = 0;
        int l = 0;
        for(int r = 0;r < nums.length;r++){
            win = win + nums[r];
            while(win >= target){
                mini = Math.min(mini,r-l+1);

                win = win - nums[l];
                l++;
            }
        }
        if(mini == Integer.MAX_VALUE){
            return 0;
        }
        return mini;
        
    }
}