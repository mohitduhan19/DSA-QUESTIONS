class Solution {
    public int trap(int[] height) {
        int left = 0 , right = height.length-1;
        int lmax = 0 , rmax = 0 , ans = 0;
        
        while(left < right){
            if(height[left] < height[right]){
                if(height[left] > lmax)lmax = height[left];
                else ans += lmax - height[left];
                left++;
            }else{
                
                if(height[right] > rmax)rmax = height[right];
                else ans += rmax - height[right];
                right--;
            
        }
          
    }
          return ans;
    }
}