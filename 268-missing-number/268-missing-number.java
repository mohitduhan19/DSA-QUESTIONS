class Solution {
    public int missingNumber(int[] nums) {
        int x  = nums.length;
       long nsum = x*(x + 1)/2;
        long sum = 0;
        for(int i = 0; i < nums.length;i++){
            sum += nums[i];
        }
        return (int)nsum - (int)sum;
    }
}
