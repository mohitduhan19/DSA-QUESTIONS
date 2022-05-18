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
    int xKaLeft;
    int xKaRight;
    public int size(TreeNode root , int x){
        if(root == null)return 0;
        
        int ls = size(root.left , x);
        int rs = size(root.right , x);
        
        if(root.val == x){
            xKaLeft = ls;
            xKaRight = rs;
        }
        int ts = ls + rs +1;
        return ts;
    }
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        size(root , x);
        int otherside = n - (xKaLeft + xKaRight + 1);
        int maxofthree = Math.max(otherside , Math.max(xKaLeft , xKaRight));
        int rest = n - maxofthree;
        if(rest < maxofthree){
            return true;
        }else{
            return false;
        }
    }
}