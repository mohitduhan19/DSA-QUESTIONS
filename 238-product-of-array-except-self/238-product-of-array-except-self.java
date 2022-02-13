class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] rightproduct = new int[nums.length];
        int prod = 1;
        for(int i = nums.length - 1;i>=0;i--){
            prod *= nums[i];
            rightproduct[i] = prod;
        }
        
        prod = 1;
        int[] res = new int[nums.length];
        for(int i = 0; i< nums.length - 1;i++){
            int rp = rightproduct[i + 1];
            res[i] = prod * rp;
            prod *= nums[i];
        }
        res[nums.length - 1] = prod; 
        return res;
    }
}