class Solution {
    public boolean lemonadeChange(int[] nums) {
        int five = 0;
        int ten = 0;

        for(int i = 0;i < nums.length;i++){
            if(nums[i] == 5){
                five++;
            }
            else if(nums[i] == 10){
                ten++;
                if(five > 0){
                    five--;
                }
                else{
                    return false;
                }
            }
            else{
                if(ten > 0 && five > 0){
                    ten--;
                    five--;
                }
                else if(five >= 3){
                    five = five - 3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}