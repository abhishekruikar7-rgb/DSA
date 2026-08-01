class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);

        int c = 0;
        int sum = 0;
        for(int i = 0;i < nums.length;i++){
            sum = sum + nums[i];
            int d = sum % k;

            if(d < 0){
                d = d + k;
            }

            if(mp.containsKey(d)){
                c = c + mp.get(d);
            }
            mp.put(d,mp.getOrDefault(d,0)+1);
        }
        return c;
    }
}