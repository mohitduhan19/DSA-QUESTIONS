class Solution {
    public boolean ispossible(int[] nums , int sp , int max){
        int time = 0;
        for(int val : nums){
            time += (int)Math.ceil(val*1.0/sp);
        }
        return time<=max;
    }
    public int max(int[] nums){
        int max = 0;
        for(int val : nums){
            max = Math.max(max , val);
        }
        return max;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low =  0 , high = max(piles);
        int ans = 0 ;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(ispossible(piles , mid , h) == true){
                ans = mid;
                high = mid - 1;
            }else{
                low= mid + 1;
            }
        }
        return ans;
    }
}