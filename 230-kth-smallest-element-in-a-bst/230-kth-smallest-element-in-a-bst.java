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
    public void helper(TreeNode root ,   PriorityQueue<Integer> p){
        if(root == null)return;
        p.add(root.val);
        helper(root.left , p);
        helper(root.right , p);
    }
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>();             
        helper(root , p);
        int ans = 0;
        for(int i = 0 ; i < k;i++){
            ans = p.remove();
        }
        return ans;
    }
}