class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stk = new Stack<>();
        stk.push(-1);
        int maxarea = 0;
        for(int i = 0; i <= heights.length;i++){
            int val = i == heights.length?0:heights[i];
            
            while(stk.peek() != -1 &&  heights[stk.peek()] >= val){
                int rm = i;
                int h = heights[stk.pop()];
                int lm = stk.peek();
                maxarea = Math.max(maxarea , h * (rm -lm -1));
            }
            stk.push(i);
        }
        return maxarea;
    }
}