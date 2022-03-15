class Solution {
    public int longestMountain(int[] nums) {
       int max = 0;
        for(int i = 1; i < nums.length - 1; i++){
            if(nums[i] > nums[i - 1] && nums[i] > nums[i + 1]){
                int left = i - 1;
                int right = i + 1;
                
                while(left > 0 && nums[left] > nums[left - 1])left--;
                while(right < nums.length-1 && nums[right] > nums[right + 1])right++;
                 max = Math.max(max , right - left + 1);
            }
           
        }
        return max;
    }
}