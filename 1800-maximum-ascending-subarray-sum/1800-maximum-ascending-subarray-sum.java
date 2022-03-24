class Solution {
    public int maxAscendingSum(int[] nums) {
         int max = Integer.MIN_VALUE , sum = nums[0];
        for(int i = 1; i < nums.length;i++){
            if(nums[i] > nums[i - 1]){
                sum += nums[i];
            }else{
                max = sum > max ? sum : max;
                sum = nums[i];
            }
        }
        if(sum > max)return sum;
        return max;
    }
}