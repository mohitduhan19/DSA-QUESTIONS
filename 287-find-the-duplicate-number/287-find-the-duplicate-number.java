class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0; 
        while(i < nums.length){
            if(nums[i] != i + 1){
                
                int index = nums[i] - 1;
                if(nums[i] != nums[index]){
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                }else{
                    return nums[i];
                }
            }
            else{
                    i++;
             }
        }
      return -1;
        
    }
}