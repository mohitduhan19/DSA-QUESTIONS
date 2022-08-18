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
    public void flatten(TreeNode root) {   
        if(root == null)return;
        //recursive o(h) space
//         TreeNode l = root.left;
//         TreeNode r = root.right;
        
//         root.left = null;
        
//         flatten(l);
//         flatten(r);
        
//         root.right = l;
//         TreeNode curr = root;
//         while(curr.right != null)curr = curr.right;
//         curr.right = r;
        
        while(root != null){
            if(root.left != null){
                TreeNode temp = root.left;
                TreeNode curr = temp;
                while(curr.right != null)curr = curr.right;
                curr.right = root.right;
                root.left = null;
                root.right = temp;
                
            }
            root = root.right;
        }
    }
}