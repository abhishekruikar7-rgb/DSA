class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i : nums){
            mp.put(i,mp.getOrDefault(i,0)+1);

        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i < nums.length;i++){
            if(mp.get(nums[i]) == 1){
                ans.add(nums[i]);
            }
        }
        int[] res = new int[ans.size()];
        for(int i = 0;i < ans.size();i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}