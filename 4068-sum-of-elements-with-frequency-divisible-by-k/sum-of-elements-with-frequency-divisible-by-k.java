class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i : nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int sum = 0;
        for(int i = 0;i < nums.length;i++){
            if(mp.get(nums[i]) % k == 0){
                sum = sum + nums[i];
            }
        }
        return sum;
    }
}