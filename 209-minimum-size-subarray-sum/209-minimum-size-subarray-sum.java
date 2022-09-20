class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0 , right = 0 , sum = 0, len = Integer.MAX_VALUE;
        int x= 0;
        for(int i = 0; i < nums.length;i++){
        x += nums[i];
        }
        if(x < target)return 0;
        while(right < nums.length){
            sum += nums[right];
          
            while(sum >= target){
                len = Math.min(len , right - left + 1);
                sum -= nums[left];
                left++;
            }
            right++;
            
        }
       
        return len;
    }
}