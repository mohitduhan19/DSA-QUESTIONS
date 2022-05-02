class Solution {
    public int[] sortArrayByParity(int[] nums) {
     
        int i = 0 , j = 0;
        while(j < nums.length){
            if(nums[j] %2 != 0){
                j++;
            }else{
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;j++;
            }
            
        }
        return nums;
    }
}