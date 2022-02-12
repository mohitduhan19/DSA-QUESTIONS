class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k < 1)return 0;
        int left = 0 , product = 1, count =0;
        
       for(int right = 0;right < nums.length;right++){
            product *= nums[right];
           
           while(product >= k && left <= right){
              product /= nums[left];
                  left++;
           }
           count += right - left + 1;
        }
        return count;
        
    }
}