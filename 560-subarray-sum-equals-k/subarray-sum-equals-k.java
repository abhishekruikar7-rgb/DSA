class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();

        mp.put(0,1);
        int c = 0;
        int sum = 0;
        for(int i = 0;i < nums.length;i++){
            sum = sum + nums[i];
            int val = sum - k;
            if(mp.containsKey(val)){
                c = c + mp.get(val);
            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return c;
    }
}