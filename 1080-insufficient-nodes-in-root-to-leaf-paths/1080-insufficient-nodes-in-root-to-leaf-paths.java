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
    private TreeNode helper(TreeNode root , int limit , int sum){
        if(root == null)return null;
        if(root.left == null && root.right == null){
            if(root.val + sum < limit)return null;
            else return root;
        }
        
        root.left = helper(root.left , limit , root.val + sum);
        root.right = helper(root.right, limit , root.val + sum);
        
        if(root.left == null && root.right == null)return null;
        
        return root;
    }
    public TreeNode sufficientSubset(TreeNode root, int limit) {
        return helper(root , limit , 0);
    }
}
