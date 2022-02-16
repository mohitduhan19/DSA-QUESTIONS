class Solution {
    public int[] dailyTemperatures(int[] nums) {
        Stack<Integer> stk = new Stack<>();
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length;i++){
            while(stk.size() > 0 && nums[stk.peek()] < nums[i]){
                int idx = stk.pop();
                 ans[idx] = i - idx;
            }
           
            stk.push(i);
        }
        return ans;
    }
}

// class Solution {
//     public int[] dailyTemperatures(int[] temperatures) {
//         Stack<Integer> stack = new Stack();
//         int result[] = new int[temperatures.length];
//         for(int i = 0;i<temperatures.length;i++){
//             while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
//                 int idx = stack.pop();
//                 result[idx] = i - idx; 
//             }
//             stack.push(i);
//         }
//         return result;
//     }
// }