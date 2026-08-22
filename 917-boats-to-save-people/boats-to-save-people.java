class Solution {
    public int numRescueBoats(int[] nums, int limit) {
        int c = 0;
        Arrays.sort(nums);
        int s = 0;
        int e = nums.length-1;
        while(s <= e){
            if(nums[s] + nums[e] <= limit){
                s++;
            }
            e--;
            c = c + 1;
        }
        return c;
    }
}