class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int[] pre = new int[nums.length];
        pre[0] = nums[0];
        for(int i = 1;i < nums.length;i++){
            pre[i] = pre[i-1] + nums[i];
        }
        HashMap<Integer,Integer> mp = new HashMap<>();
        int c = 0;
        for(int i = 0;i < nums.length;i++){
            if(pre[i] == goal){
                c++;
            }
            int val = pre[i]-goal;
            if(mp.containsKey(val)){
                c = c + mp.get(val);
            }
            if(!mp.containsKey(pre[i])){
                mp.put(pre[i],0);
            }
            mp.put(pre[i],mp.getOrDefault(pre[i],0)+1);
        }
        return c;
        
    }
}