class Solution {
   public boolean ispossible(int[] nums ,int mid ,int m){
    int currsum = 0 , currsubarray= 1;
    for(int i =0;i< nums.length;i++){
        if(currsum + nums[i] <= mid){
            currsum += nums[i];
        }else{
            currsubarray++;
            currsum = nums[i];
        }
    }
    if(currsubarray > m)return false;
    return true;
}
    public int maxofarray(int[] nums ,int m){
        int max = 0; 
        for(int i = 0; i<nums.length;i++){
            max = Math.max(max , nums[i]);
        }
        return max;
    }
     public int sumofarray(int[] nums ,int m){
        int sum = 0; 
        for(int i = 0; i<nums.length;i++){
            sum += nums[i]; 
        }
        return sum;
    }
   public int splitArray(int[] nums, int m) {
        int low = maxofarray(nums , m);
        int high = sumofarray(nums , m);
        int ans = high;
        
        while(low <= high){
        int mid = low + (high - low)/2;
        if(ispossible(nums ,mid ,m) == true){
            ans = mid;
            high = mid - 1;
        }else{
            low = mid + 1;
        }
        }
              return ans;

    }
 }                       
