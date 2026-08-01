class Solution {
    public int[] getStrongest(int[] arr, int k) {
        ArrayList<int[]> ans = new ArrayList<>();

        Arrays.sort(arr);
        int mid = arr[(arr.length-1)/2];

        for(int i = 0;i < arr.length;i++){
            int diff = Math.abs(arr[i]-mid);

            ans.add(new int[]{diff,arr[i]});
        }

        ans.sort((a, b) -> {
            if(a[0] != b[0]) {
                return b[0] - a[0];
            }

            return b[1] - a[1];
        });
        
        int[] res = new int[k];
        for(int i = 0;i < k;i++){
            res[i] = ans.get(i)[1];
        }
        return res;

    }
}