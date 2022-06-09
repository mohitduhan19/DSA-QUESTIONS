class Solution {
    public int[] twoSum(int[] nums ,int target){
        int l = 0 , r = nums.length - 1;
        
        while(l <= r){
            if(nums[l] + nums[r] > target){
                r--;
            }else if(nums[l] + nums[r] < target){
                l++;
            }else{
                return new int[]{l + 1 , r + 1};
            }
        }
        return null;
    }
}