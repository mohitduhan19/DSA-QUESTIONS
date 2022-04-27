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
    public void paths(TreeNode root , String s , List<String> ans){
        if(root == null)return;
        if(root.left == null && root.right == null){
            ans.add(s + root.val);
        }
        
        if(root.left != null)paths(root.left, s+root.val+"->", ans);
        if(root.right != null)paths(root.right , s+ root.val+ "->" , ans);
        
        
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        paths(root , "" , res);
        return res;
    }
}