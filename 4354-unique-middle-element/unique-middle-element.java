class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i : nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int mid = (nums.length)/2;
        if(mp.get(nums[mid]) == 1){
            return true;
        }
        return false;

    }
}