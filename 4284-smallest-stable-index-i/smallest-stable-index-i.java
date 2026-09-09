class Solution {
    public int firstStableIndex(int[] nums, int k) {
        for(int i = 0;i < nums.length;i++){
            int maxi = Integer.MIN_VALUE;
            for(int j = 0;j <= i;j++){
                if(nums[j] > maxi){
                    maxi = nums[j];
                }
            }
            int mini = Integer.MAX_VALUE;
            for(int a = i;a < nums.length;a++){
                if(nums[a] < mini){
                    mini = nums[a];
                }
            }

            if(maxi-mini <= k){
                return i;
            }
        }
        return -1;
    }
}