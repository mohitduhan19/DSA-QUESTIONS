class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stk = new Stack<>();
        int[] nge = new int[nums.length];
      
        for(int i = nums.length - 2; i >= 0 ;i --){
            while(stk.size() > 0 && stk.peek() <= nums[i]){
                stk.pop();
            }
            stk.push(nums[i]);
        }
        
        for(int i = nums.length - 1; i >= 0;i--){
            while(stk.size() > 0 && stk.peek() <= nums[i]){
                stk.pop();
            }
            nge[i] = stk.size() == 0 ? -1 : stk.peek();
            stk.push(nums[i]);
        }
      
        return nge;
    }
}