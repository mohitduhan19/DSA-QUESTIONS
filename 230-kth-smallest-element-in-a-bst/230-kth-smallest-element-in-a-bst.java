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
    int count = 0 , out = 0;
    public void inorder(TreeNode root ,int k ){
       if(root == null)return;
       
        inorder(root.left , k);   
        count++;
        if(count == k){
            out = root.val;
            return ;
        }
        
        inorder(root.right , k);
        
    }
    public int kthSmallest(TreeNode root, int k) {
        if(root == null)return 0;
         inorder(root , k);
        return out;
    }
}