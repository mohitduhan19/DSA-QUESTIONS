class Solution {
    public boolean increasingTriplet(int[] nums) {
      int min1 = Integer.MAX_VALUE ,  min2 = Integer.MAX_VALUE;
       
        for(int val : nums){
            if(val <= min1){
                min1 = val;
            }
           else if(val <= min2){
                min2 = val;
            }
            else  return true;
           
           
        }
        return false;
    }
}


