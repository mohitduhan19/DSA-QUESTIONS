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
    public int max(TreeNode root){
        if(root.right == null)return root.val;
        return max(root.right);
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)return null;
        
        if(root.val == key){
            if(root.left == null && root.right == null){
                return null;
            }else if(root.left == null){
                //single child
                return root.right;
            }else if(root.right == null){
                return root.left;
            }else{
                //two children
                int inorderPredecessor = max(root.left);
                root.val = inorderPredecessor;;
                root.left = deleteNode(root.left , inorderPredecessor);
            } 
        }
        if(root.val < key){
            root.right = deleteNode(root.right , key);
        }else{
            root.left = deleteNode(root.left , key);
        }
        return root;
    }
}