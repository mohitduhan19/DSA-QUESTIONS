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
    int sum = 0;
    public void sumofleaves(TreeNode root , boolean isleft){
        if(isleft && root.left == null && root.right == null){
            sum += root.val;
            return;
        }
        if(root.left != null)sumofleaves(root.left , true);
        if(root.right != null)sumofleaves(root.right , false);
       
    }
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)return 0;
      sumofleaves(root , false);
        return sum;
    }
}