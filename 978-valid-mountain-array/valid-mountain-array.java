class Solution {
    public boolean validMountainArray(int[] arr) {  
        int st = 0;
        int end = arr.length-1;

        while(st < arr.length-1 && arr[st] < arr[st+1]){
            st++;
        }
        while(end > 0 && arr[end] < arr[end-1]){
            end--;
        }
        if(st > 0 && end < arr.length-1 && st == end){
            return true;
        }
        else{
            return false;
        }
    }
}