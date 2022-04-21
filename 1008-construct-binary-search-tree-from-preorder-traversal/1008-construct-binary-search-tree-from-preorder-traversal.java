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
    static int idx;
    private TreeNode preorderBst(int[] preorder , int leftRange , int rightRange){
        if(idx >= preorder.length || preorder[idx] < leftRange || preorder[idx] > rightRange)return null;
        TreeNode node = new TreeNode(preorder[idx++]);
        node.left = preorderBst(preorder , leftRange , node.val);
        node.right = preorderBst(preorder , node.val , rightRange);
        return node;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        int leftRange = Integer.MIN_VALUE;
        int rightRange = Integer.MAX_VALUE;
        idx = 0;
        return preorderBst(preorder , leftRange , rightRange);
    }
}