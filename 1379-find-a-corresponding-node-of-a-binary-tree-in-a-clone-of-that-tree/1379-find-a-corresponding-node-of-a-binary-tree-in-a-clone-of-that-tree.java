/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
     TreeNode res;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original == null)return null;
                if(original == target){
            res  = cloned;
        }
        getTargetCopy(original.left , cloned.left ,target);
       
        getTargetCopy(original.right , cloned.right , target);

        return res;
    }
}