class Solution {
    public int kadens(int[] nums){
        int curs = 0 , bestsum = Integer.MIN_VALUE;
        
        for(int i = 0; i < nums.length;i++){
            if(curs + nums[i] >= nums[i]){
                curs += nums[i];
            }else{
                curs = nums[i];
            }
            if(curs > bestsum)bestsum = curs;
        }
        return bestsum;
    }
    
    public int maxSubarraySumCircular(int[] nums) {
        if(nums.length == 0)return 0;
        int linearSum = kadens(nums);
        int totalSum = 0;
        
        for(int i = 0; i < nums.length;i++){
            totalSum += nums[i];
            nums[i] *= -1;
        }
        
        int InvertedSum = kadens(nums);
        if(totalSum + InvertedSum == 0)return linearSum;
        return Math.max(linearSum , totalSum + InvertedSum);
    }
}