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
    long ts , max;
    public void tsum(TreeNode root){
        if(root == null)return;
        
        tsum(root.left);
        tsum(root.right);
        
        ts +=  root.val;
    }
    public long subSum(TreeNode root){
        if(root == null)return 0;
        
        long l = subSum(root.left);
        long r = subSum(root.right);
        long s = l + r + root.val;
        max = Math.max(max , s*(ts-s));
        return s;
    }
    public int maxProduct(TreeNode root) {
        tsum(root);
        subSum(root);
        return (int)(max%((int)Math.pow(10,9) + 7));
    }
}