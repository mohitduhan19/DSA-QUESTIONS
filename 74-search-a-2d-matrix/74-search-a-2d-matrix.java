class Solution {
    public boolean searchMatrix(int[][] nums, int target) {
//         int n = nums.length , m = nums[0].length;
//         int left = 0 , right = n*m-1;
        
//         for(int i = 0; i <= nums.length;i++){
//             int mid = left + (right - left)/2;
            
//             int row = mid/m;
//             int col = mid%m;
            
//             if(nums[row][col] == target)return true;
//             else if(nums[row][col] > target){
//                right = mid - 1;
//             }else{
//                 left = mid + 
    
//             }
//         }
        
//        return false;
        
        int i = 0 , j = nums[0].length-1;
        
       while( i < nums.length && j >= 0){
            if(target == nums[i][j])return true;
           else if(target < nums[i][j]){
               j--;
           }else{
               i++;
           }
        }
        return false;
    }
}