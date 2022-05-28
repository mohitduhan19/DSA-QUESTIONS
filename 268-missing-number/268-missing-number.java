class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
         
        while(i < nums.length){
           int idx = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[idx]){
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
            }else{
                i++;
            }
        }
        for(int index = 0; index < nums.length;index++){
            if(nums[index] != index){
                return index;
            }
        }
        return nums.length;
    }
}