/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
//     //TC - O(n^2) , SC - O(logh);
//       int count = 0;
//     private void helper(TreeNode root , int sum){
//         if(root == null)return;
//         if(root.val == sum)count++;
        
//         helper(root.left , sum - root.val);
//         helper(root.right , sum - root.val);
//     }
//     public int pathSum(TreeNode root, int target) {
//         if(root == null)return 0;
//         helper(root , target);
//         pathSum(root.left , target);
//         pathSum(root.right , target);
//         return count;
    
    //Approach 2 : TC - O(n) , SC - O(n);
   int ans;
	public int pathSum(TreeNode root, int targetSum) {
        Map<Integer, Integer> count = new HashMap();
        count.put(0, 1);
        solve(root, 0, targetSum, count);  
        return ans;
    }
    
    void solve(TreeNode root, int currSum, int target, Map<Integer, Integer> count) {
        if(root == null) return;
        int sum = currSum + root.val;
        if(count.containsKey(sum - target)) {
            ans += count.get(sum - target);
        }
        count.put(sum, count.getOrDefault(sum, 0) + 1);
        solve(root.left, currSum + root.val, target, count);
        solve(root.right, currSum + root.val, target, count);
        count.put(sum, count.get(sum) - 1);
    
    }
}