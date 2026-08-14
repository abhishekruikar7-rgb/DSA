class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i : nums1){
            mp.put(i,1);
        }
        for(int i = 0;i < nums2.length;i++){
            if(mp.containsKey(nums2[i]) && mp.get(nums2[i]) == 1){
                ans.add(nums2[i]);
                mp.put(nums2[i],0);
            }
        }
        int[] res = new int[ans.size()];
        for(int i = 0;i < ans.size();i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}