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
    // class HousePair{
    //     int withRoberry = 0;
    //     int withoutRoberry = 0;
    // }
    
//     public HousePair helper(TreeNode root){
//         if(root == null)return new HousePair();
        
//         HousePair left = helper(root.left);
//         HousePair right = helper(root.right);
        
//         HousePair ans = new HousePair();
        
//         ans.withRoberry = left.withoutRoberry + root.val + right.withoutRoberry;
//         ans.withoutRoberry = Math.max(left.withoutRoberry , left.withRoberry) + 
//             Math.max(right.withoutRoberry , right.withRoberry);
//         return ans;
//     }
    public int[] helper(TreeNode root){
        if(root == null)return new int[2];
        int[] ans = new int[2];
        
         int[] left = helper(root.left);
         int[] right = helper(root.right);
        
        ans[0] = left[1] + root.val + right[1];
        ans[1] = Math.max(left[0] , left[1]) + Math.max(right[0] , right[1]);
        return ans;
    }
    public int rob(TreeNode root) {
        // HousePair ans = helper(root);
        // return Math.max(ans.withoutRoberry , ans.withRoberry);
        
        int[] ans = helper(root);
        return Math.max(ans[0] , ans[1]);
    }
}