class Solution {
    public int partitionDisjoint(int[] nums) {
   
        int[] rightmin = new int[nums.length + 1];
        rightmin[nums.length] = Integer.MAX_VALUE;
        for(int i = nums.length-1;i >= 0;i--){
            rightmin[i] = Math.min(rightmin[i + 1] , nums[i]);
               
            }
        
        int leftmax = Integer.MIN_VALUE;
        int ans = 0;
        for(int  i = 0; i< nums.length;i++){
            leftmax = Math.max(leftmax , nums[i]);
            if(leftmax <= rightmin[i + 1]){
                ans = i;
                break;
            }
        }
            
        
    return ans + 1;
      
    }
}