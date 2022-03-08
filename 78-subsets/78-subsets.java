class Solution {
    public void backtrack(  int[] nums , int i , List<List<Integer>>res ,List<Integer>curr){
        if(i == nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        
        curr.add(nums[i]);
        backtrack(nums , i + 1 , res ,curr);
        curr.remove(curr.size() - 1);
        backtrack(nums , i + 1 , res ,curr);
        
    }
    public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>>res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(nums , 0 , res , curr);
        return res;
    }
}