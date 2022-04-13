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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
         if(root == null)return res;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        
        while(q.size() > 0){
            List<Integer> list = new ArrayList<>();
            int n = q.size();
            for(int i = 0; i < n; i++){
                TreeNode curr = q.remove();
                list.add(curr.val);
                
                if(curr.left != null)q.add(curr.left);
                if(curr.right != null)q.add(curr.right);
                
            }
                res.add(list);
            
        }
        Collections.reverse(res);
        return res;
    }
}