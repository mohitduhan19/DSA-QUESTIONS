class Solution {
    private int kadane(int [] arr){
        int csum = arr[0];
        int msum = arr[0];
        
        for(int i = 1; i < arr.length; i++){
            int val = arr[i];
            if(csum > 0){
                csum += val;
            } else {
                csum = val;
            }
            msum = Math.max(csum, msum);
        }
        return msum;
    }
    private int kadaneOfTwo(int [] arr){
        int [] narr = new int[2 * arr.length];
        for(int i = 0; i < arr.length; i++){
            narr[i] = arr[i];
        }
        for(int i = 0; i < arr.length; i++){
            narr[i + arr.length] = arr[i];
        }
        return kadane(narr);
    }
    public int kConcatenationMaxSum(int[] arr, int k) {
        long sum = 0;
        for(int val : arr){
            sum += val;
        }
        if(k == 1){
            return kadane(arr);
        } else if(sum < 0){
            int res = kadaneOfTwo(arr);
            return res < 0 ? 0 : res;
        } else{
            return (int)((kadaneOfTwo(arr) + (k - 2) * sum) % (1e9 + 7));
        }
    }
}