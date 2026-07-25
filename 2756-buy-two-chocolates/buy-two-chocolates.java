class Solution {
    public int buyChoco(int[] nums, int money) {
        Arrays.sort(nums);
        int x = (nums[0]) + (nums[1]);
        if(x <= money){
            return money - x;
        }
        return money;
    }
}