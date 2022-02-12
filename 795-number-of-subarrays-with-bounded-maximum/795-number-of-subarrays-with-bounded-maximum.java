class Solution {
    public int numSubarrayBoundedMax(int[] arr, int left, int right) {
        int start=0 , end = 0 , count = 0 , prevcount = 0;
        
        while(end < arr.length){  
            if(arr[end] >= left && arr[end] <= right){
                prevcount = end - start + 1;
                count += prevcount;
            }else if(arr[end] < left){
                count += prevcount;
            }else{
                start = end + 1;
                prevcount=0;
            }
            end++;
        }
        return count;
    }
}