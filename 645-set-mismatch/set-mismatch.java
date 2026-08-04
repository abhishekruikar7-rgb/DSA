class Solution {
    public int[] findErrorNums(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i : nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(int i = 0;i < nums.length;i++){
            if(mp.get(nums[i]) == 2){
                ans.add(nums[i]);
                break;
            }
        }
        
        for(int i = 0;i < nums.length;i++){
            while(nums[i] >= 1 && nums[i] <= nums.length && nums[i] != nums[nums[i]-1]){
                int temp = nums[i];
                nums[i] = nums[temp-1];
                nums[temp-1] = temp;
            }
        }

        for(int i = 0;i < nums.length;i++){
            if(nums[i] != i+1){
                ans.add(i+1);
                break;
            }
        }
        return new int[]{ans.get(0), ans.get(1)};


    }
}