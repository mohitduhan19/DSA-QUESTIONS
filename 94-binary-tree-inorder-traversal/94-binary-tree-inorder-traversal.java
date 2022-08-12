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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        TreeNode curr = root;
        
        while(curr != null){
            //if left is  null
            if(curr.left == null){
                ans.add(curr.val);
                curr = curr.right;
            }else{
                //is left processed
                TreeNode node = curr.left;
                while(node.right != null && node.right != curr){
                    node = node.right;
                }
                if(node.right == null){
                    node.right = curr;
                    curr = curr.left;
                }else{
                    node.right = null;
                    ans.add(curr.val);
                    curr = curr.right;
                }
            }
        }
        return ans;
    }
}