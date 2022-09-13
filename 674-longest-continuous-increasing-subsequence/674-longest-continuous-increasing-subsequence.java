class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length == 0)return 0;
     int currmax = 1, ans = 1;
         
        for(int i = 1; i < nums.length;i++){
            currmax = nums[i] > nums[i - 1]?currmax + 1 : 1;
            ans = Math.max(ans , currmax);
        }
       return ans;
    }
}