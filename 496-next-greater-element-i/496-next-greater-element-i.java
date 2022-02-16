class Solution {
    public int[] nge(int[] nums){
        Stack<Integer> stk = new Stack<>();
        
        int[] ans = new int[nums.length];
        for(int i = nums.length- 1;i>=0;i--){
            while(stk.size() > 0 && stk.peek() < nums[i])stk.pop();
            ans[i] = stk.size() == 0?-1:stk.peek();
            stk.push(nums[i]);
        }
        return ans;
    }
    
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       HashMap<Integer , Integer> map = new HashMap<>();
        int[] nger = nge(nums2);
        for(int i = 0; i< nums2.length;i++){
            map.put(nums2[i] , nger[i]);
        }
        int[] ans = new int[nums1.length];
        for(int i = 0; i< nums1.length;i++){
            ans[i] = map.get(nums1[i]);
        }
        
        return ans;
    }
}