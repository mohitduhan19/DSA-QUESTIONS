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
    int min = Integer.MAX_VALUE;
    TreeNode prev = null;
    public void min(TreeNode currNode){
        if(currNode == null)return;
        
        min(currNode.left);
        if(prev != null){
            min = Math.min(min , Math.abs(prev.val - currNode.val));
        }
        
        prev = currNode;
        min(currNode.right);
    }
    public int getMinimumDifference(TreeNode root) {
     min(root);
        return min;
    }
}