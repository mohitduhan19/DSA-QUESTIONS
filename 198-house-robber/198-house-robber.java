class Solution {
    private Integer[]dp;
    public int helper(int[] nums , int curr){
        if(curr >= nums.length)return 0;
        if(dp[curr] != null){
            return dp[curr]; 
        }
        int steal = nums[curr] + helper(nums , curr + 2 );
        int notSteal = helper(nums,  curr + 1);
        return dp[curr] = Math.max(steal , notSteal);
    }
    public int rob(int[] nums) {
    dp = new Integer[nums.length];
     return helper(nums , 0);
    }
}