class Solution {
    public int pivotIndex(int[] nums){
        int totalsum = 0;
        for(int num : nums){
            totalsum += num;
        }
        
        int leftsum = 0 , rightsum = totalsum;
        for(int i = 0; i <nums.length;i++){
            rightsum -= nums[i];
            if(leftsum == rightsum){
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }
}