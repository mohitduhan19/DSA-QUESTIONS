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
    // public void postorder(TreeNode root , List<Integer> ans){
    //     if(root == null)return;
    //     postorder(root.left , ans);
    //     postorder(root.right ,ans);
    //     ans.add(root.val);
    // }
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null)return new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        //-----------------Recursive---------------
        // postorder(root , ans);
        // return ans;
        //----------------Iterative----------------
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(root);
        while(s1.size() > 0){
            TreeNode node = s1.pop();
            s2.push(node);
            if(node.left != null)s1.push(node.left);
            if(node.right != null)s1.push(node.right);
            
        }
        while(s2.size() > 0){
            ans.add(s2.pop().val);
        }
        return ans;
        

    }
}