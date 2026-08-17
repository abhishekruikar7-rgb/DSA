class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[n+m];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] <= nums2[j]){
                ans[k] = nums1[i];
                k++;
                i++;
            }
            else{
                ans[k] = nums2[j];
                j++;
                k++;
            }
        }
        while(i < nums1.length){
            ans[k] = nums1[i];
            k++;
            i++;
        }
        while(j < nums2.length){
            ans[k] = nums2[j];
            k++;
            j++;
        }
        if((n+m) % 2 == 1){
            return ans[ans.length/2];
        }
        else{
            return (double)(ans[ans.length/2] + ans[(ans.length/2)-1])/2;
        }
    }
}