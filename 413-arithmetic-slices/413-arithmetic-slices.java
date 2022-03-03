class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length < 3)return 0;
        
        int count = 0;
        for(int i = 0; i < nums.length;i++){
            for(int j = i; j < nums.length - 2;j++){
            if(nums[j] - nums[j + 1] == nums[j + 1] - nums[j + 2]){
                count++;
            }else{
               break;
            }
            }
        }
        return count;
    }
}  