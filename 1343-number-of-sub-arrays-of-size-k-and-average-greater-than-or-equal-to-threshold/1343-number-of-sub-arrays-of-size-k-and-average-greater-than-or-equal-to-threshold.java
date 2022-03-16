class Solution {
    public int numOfSubarrays(int[] arr, int k, int t) {
        int left = 0 ,count = 0 , sum = 0;
        for(int right = 0; right <= arr.length;right++){
            if(right < k){
                sum += arr[right];
                continue;
            }
            if((sum/k) >= t){
                count++;
            }
           if(right == arr.length)break;
                sum += arr[right] - arr[left];
                left++;
                
            
        }
        return count;
    }
}

