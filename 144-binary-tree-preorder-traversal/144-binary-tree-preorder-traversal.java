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
    public void preorder(TreeNode root , List<Integer> ans){
        if(root == null)return;
        ans.add(root.val);
        preorder(root.left , ans);
        preorder(root.right , ans);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
           if(root == null)return new ArrayList<>();
           List<Integer> ans = new ArrayList<>();
        //-----------------recursive-------------------------
           preorder(root , ans);
        return ans;
        
        // ------------ Iterative -------------------------------------------
        // Stack<TreeNode> s = new Stack<>();
        // s.push(root);
        // while(s.size() > 0){
        //     TreeNode node = s.pop();
        //     ans.add(node.val);
        //     if(node.right != null)s.push(node.right);
        //     if(node.left != null)s.push(node.left);
        // }
        // return ans;
    }
}