class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i : nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(int i = 0;i < nums.length;i++){
            if(mp.get(nums[i]) >= 2){
                return true;
            }
        }
        return false;
    }
}