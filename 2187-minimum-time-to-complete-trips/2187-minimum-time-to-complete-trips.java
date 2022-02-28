class Solution {
    public boolean ispossible(int[] time ,int total,long x ){
        long sum = 0;
        for(int val : time){
            sum += x/val;
        }
        return sum>=total;
    }
    public long minimumTime(int[] time, int totalTrips) {
        long left = 0, right = 100000000000000l , ans = right;
        while(left < right){
            long mid = left + (right - left)/2;
            
            if(ispossible(time , totalTrips , mid) == true){
                ans = mid;
                right = mid ;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }
}

