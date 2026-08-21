class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i : nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int n = nums.length/3;
        for(int i = 0;i < nums.length;i++){
            if(mp.get(nums[i]) > n){
                ans.add(nums[i]);
                mp.put(nums[i],0);
            }
        }
        return ans;
    }
}