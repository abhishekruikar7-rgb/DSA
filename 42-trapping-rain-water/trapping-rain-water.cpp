class Solution {
public:
    int trap(vector<int>& nums) {
        int st = 0;
        int end = nums.size()-1;

        int leftmax = 0;
        int rightmax = 0;
        int total = 0;

        while(st < end){
            leftmax = max(leftmax, nums[st]);
            rightmax = max(rightmax, nums[end]);

            if(leftmax < rightmax){
                total = total + leftmax - nums[st];
                st++;
            }
            else{
                total = total + rightmax - nums[end];
                end--;
            }
        }
        return total;
    }
};