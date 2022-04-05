class Solution {
    public int maxArea(int[] height) {
        int n =  height.length;
        int left = 0 , right = n - 1;
        int area = 0;
        while(left < right){
            int width = right - left;
            int heights = Math.min(height[left] , height[right]);
            area = Math.max(area ,width * heights);
            if(height[left] <= height[right])left++;
            else right--;
        }
        return area;
    }
}