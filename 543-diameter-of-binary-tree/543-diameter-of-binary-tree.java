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
    public int height(TreeNode root){
         if(root == null)return -1;
        int lh = height(root.left);
        int rh = height(root.right);
        
        int he = Math.max(lh , rh) + 1;
        return he;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)return -1;
        
        int ldia = diameterOfBinaryTree(root.left);
        int rdia = diameterOfBinaryTree(root.right);
        
        int lh = height(root.left);
        int rh = height(root.right);
        int dia = lh + rh + 2;
        
        return Math.max(dia , Math.max(ldia , rdia));
    }
}