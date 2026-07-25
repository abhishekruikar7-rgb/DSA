class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i : nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int a = 0;
        for(int i = 0;i < nums.length;i++){
            if(mp.get(nums[i]) == 1){
                a = nums[i];
                break;
            }
        }
        return a;
    }
}