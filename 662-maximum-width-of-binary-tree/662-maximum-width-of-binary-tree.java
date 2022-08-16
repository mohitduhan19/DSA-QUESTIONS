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
    class pair{
        TreeNode node;
        int idx = 0;
        
        pair(TreeNode node , int idx){
            this.node = node;
            this.idx = idx;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Queue<pair> q = new ArrayDeque<>();
        int lm = 0 , rm = 0 , max = 0;
        
        q.add(new pair(root , 0));
        while(q.size() != 0){
            int size = q.size();
            lm = q.peek().idx;
            rm = q.peek().idx;
            
            while(size-- > 0){
                pair p = q.remove();
                rm = p.idx;
                
                if(p.node.left != null)q.add(new pair(p.node.left, p.idx*2 + 1));
                if(p.node.right != null)q.add(new pair(p.node.right , p.idx*2 + 2));
            }
             max = Math.max(max , rm - lm + 1);
        }
        
        
        
        return max;
    }
}