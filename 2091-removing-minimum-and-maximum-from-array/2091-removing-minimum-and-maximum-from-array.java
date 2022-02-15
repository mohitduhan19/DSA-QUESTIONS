class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE;
        for(Integer x : nums){
            max = Math.max(max , x);
            min =Math.min(min , x);
        }
        
        int minidx = 0 ,maxidx = 0;
        for(int i = 0; i <nums.length;i++){
            if(nums[i] == min)minidx = i;
            if(nums[i] == max)maxidx = i; 
        }
        
        int ans = 0;
        int small = Math.min(maxidx , minidx) , high = Math.max(maxidx , minidx);
        ans = (small + 1) + (nums.length - high);
        ans = Math.min(ans , high + 1);
        ans = Math.min(ans , nums.length - small);
        
        return ans;
        
        
        
    }
}