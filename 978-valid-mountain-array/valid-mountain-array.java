class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3){
            return false;
        }
        int left = 0;
        while(left < arr.length-1 && arr[left] < arr[left+1]){
            left++;
        }
        int right = arr.length-1;
        while(right > 0 && arr[right] < arr[right-1]){
            right--;
        }

        return left > 0 && right < arr.length-1 && left == right;
    }
}