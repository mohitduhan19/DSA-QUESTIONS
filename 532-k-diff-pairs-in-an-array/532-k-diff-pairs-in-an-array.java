class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        
        int i = 0 , j = 1 , count = 0 , sum = Integer.MIN_VALUE;
        while( i < nums.length - 1 && j < nums.length){
            if(nums[j] - nums[i] == k && nums[i] + nums[j] != sum){
                sum = nums[i] + nums[j];
                count++;
                i++;j++;
            }else if ((nums[j] - nums[i]) <k){
                j++;
            }else{
                i++;
            }
             if(i == j)j++;
        }
       
        return count;
    }
}