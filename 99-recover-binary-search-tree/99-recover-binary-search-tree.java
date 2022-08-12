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
    public void recoverTree(TreeNode root) {
        TreeNode curr = root;
        TreeNode prev = null;
        TreeNode n1 = null;
        TreeNode n2 = null;
        
        while(curr != null){
            if(curr.left == null){
                //print
                if(prev != null){
                if(curr.val < prev.val){
                    if(n1 == null){
                        n1 = prev;
                        n2 = curr;
                    }else{
                        n2 = curr;
                    }
                 }
                }
                prev = curr;
                curr = curr.right;
            }else{
                TreeNode ipred = curr.left;
                while(ipred.right != null && ipred.right != curr){
                    ipred = ipred.right;
                }
                
                if(ipred.right == null){
                    ipred.right = curr;
                    curr = curr.left;
                }else{
                    
                    //print;
                    if(prev != null){
                if(curr.val < prev.val){
                    if(n1 == null){
                        n1 = prev;
                        n2 = curr;
                    }else{
                        n2 = curr;
                    }
                 }
                }
                    prev = curr;
                    ipred.right = null;
                    curr = curr.right;
                }
            }
        }
        int temp = n1.val;
        n1.val = n2.val;
        n2.val = temp;
    }
}