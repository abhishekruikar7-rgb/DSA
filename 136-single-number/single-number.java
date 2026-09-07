class Solution {
    public int singleNumber(int[] nums) {
        int xxor = 0;
        for(int i = 0;i < nums.length;i++){
            xxor = xxor ^ nums[i];
        }
        return xxor;
    }
}