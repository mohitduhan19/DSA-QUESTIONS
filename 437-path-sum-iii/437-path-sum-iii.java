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
    int count = 0;
    private void helper(TreeNode root , int sum){
        if(root == null)return;
        if(root.val == sum)count++;
        
        helper(root.left , sum - root.val);
        helper(root.right , sum - root.val);
    }
    public int pathSum(TreeNode root, int target) {
        if(root == null)return 0;
        helper(root , target);
        pathSum(root.left , target);
        pathSum(root.right , target);
        return count;
    }
}