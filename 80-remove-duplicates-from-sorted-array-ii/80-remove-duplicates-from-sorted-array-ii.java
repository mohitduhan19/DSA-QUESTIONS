class Solution {
    public int removeDuplicates(int[] nums) {
        final int k = 2;
        int m = 1 , count = 1;
        for(int i = 1; i < nums.length;i++){
            if(nums[i] == nums[i - 1]){
                if(count < k){
                    nums[m] = nums[i];
                    m++;
                }
                count++;
            }else{
                count = 1;
                nums[m] = nums[i];
                m++;
            }
        }
        return m;
    }
}