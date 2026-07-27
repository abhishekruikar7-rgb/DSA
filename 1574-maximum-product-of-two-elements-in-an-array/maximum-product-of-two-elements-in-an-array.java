class Solution {
    public int maxProduct(int[] nums) {
        int l = 0;
        int sl = 0;
        int i = 0;
        while(i < nums.length){
            if(nums[i] > l){
                sl = l;
                l = nums[i];
            }
            else if(nums[i] <= l && nums[i] > sl){
                sl = nums[i];
            }
            i++;
        }
        return (l-1)*(sl-1);
    }
}