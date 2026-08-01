class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i : nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        ArrayList<int[]> ans = new ArrayList<>();
        for(int i = 0;i < nums.length;i++){
            ans.add(new int[]{mp.get(nums[i]),nums[i]});
            mp.put(nums[i],0);
        }

        ans.sort((a,b) -> b[0]-a[0]);
        int[] res = new int[k];
        for(int i = 0;i < k;i++){
            res[i] = ans.get(i)[1];
        }
        return res;
    }
}