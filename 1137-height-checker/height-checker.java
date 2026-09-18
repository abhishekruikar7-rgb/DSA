class Solution {
    public int heightChecker(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0;i < nums.length;i++){
            ans[i] = nums[i];
        }
        Arrays.sort(ans);
        int c = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] != ans[i]){
                c++;
            }
        }
        return c;

    }
}