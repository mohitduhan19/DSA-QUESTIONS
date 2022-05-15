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
    public int getmaxdepth(TreeNode root){
        if(root == null)return 0;
        return Math.max(getmaxdepth(root.left) , getmaxdepth(root.right)) + 1;
    }
    public int getsum(TreeNode root , int depth , int maxdepth){
        if(root == null)return 0;
        if(depth == maxdepth)return root.val;
        return getsum(root.left , depth + 1 , maxdepth) + getsum(root.right , depth + 1 , maxdepth);
    }
    public int deepestLeavesSum(TreeNode root) {
        if(root == null)return 0;
        int maxdepth = getmaxdepth(root);
        return getsum(root , 1 , maxdepth);
    }
}
