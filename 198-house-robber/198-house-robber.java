class Solution {
    public int maxAmount(int[] nums, int idx , int lastHouse , int[][] dp){
        if(idx >= nums.length)return 0;
        if(dp[idx][lastHouse] != -1)return dp[idx][lastHouse];
        if(lastHouse == 1){
            int ans = maxAmount(nums , idx + 1 , 0 , dp);
            dp[idx][lastHouse] = ans;
            return ans;
        }
        
        int ansYes = nums[idx] + maxAmount(nums , idx + 1 , 1 , dp);
        int ansNo = maxAmount(nums , idx + 1, 0 , dp);
        int maxans = Math.max(ansYes , ansNo);
        return maxans;
    }
    public int rob(int[] nums) {
        int lastHouse = 0;
        int[][] dp = new int[nums.length + 1][2];
        for(int i = 0; i < nums.length;i++){
            Arrays.fill(dp[i] , -1);
        }
        int ans = maxAmount(nums , 0 , lastHouse , dp);
        return ans;
    }
}