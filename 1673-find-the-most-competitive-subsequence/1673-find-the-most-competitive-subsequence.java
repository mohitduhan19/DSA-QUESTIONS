class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> stk = new Stack<>();
        int n = nums.length;
        for(int i = 0; i< n; i++){
            int val = nums[i];
            while(stk.size() > 0 && stk.peek() >val && n - i -1 >= k - stk.size()){
                stk.pop();
            }
            if(stk.size() < k){
                stk.push(val);
            }
        }
        
        int[] ans = new int[k];
        int i = k - 1;
        while(i >= 0)ans[i--] = stk.pop();
        
        return ans;
    }
}