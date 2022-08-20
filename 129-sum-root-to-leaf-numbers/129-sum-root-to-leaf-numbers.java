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
    public void findsum(TreeNode root , int value){
        if(root == null)return;
        int curr = value*10 + root.val;
        if(root.left == null && root.right == null){
            res += curr;
            return;
        }
        
        if(root.left != null)findsum(root.left , curr);
        if(root.right != null)findsum(root.right , curr);
    }
    private int res;
    public int sumNumbers(TreeNode root) {
        if(root == null)return 0;
         res = 0;
        findsum(root , 0);
        return res;
    }
}