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
    public int[] post(TreeNode root){
        // arr -> nodesum , numberofnodes
        if(root == null)return new int[]{0 , 0};
        
        int[] left = post(root.left);
        int[] right = post(root.right);
        
        int totalsum = left[0] + right[0] + root.val;
        int nodes = left[1] + right[1] + 1;
        if(totalsum/nodes == root.val)count++;
        
        return new int[]{totalsum , nodes};
    }
    int count = 0;
    public int averageOfSubtree(TreeNode root) {
        if(root == null)return 0;
        
        post(root);
        return count;
    }
}