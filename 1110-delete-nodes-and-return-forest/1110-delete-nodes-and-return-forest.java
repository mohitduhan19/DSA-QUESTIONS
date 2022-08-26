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
    public List<TreeNode> delNodes(TreeNode root, int[] nums) {
        List<TreeNode> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int elem : nums){
            set.add(elem);
        }
        helper(root  , ans , set);
        if(!set.contains(root.val)){
            ans.add(root);
        }
        return ans;
    }
    public TreeNode helper(TreeNode root , List<TreeNode> ans , HashSet<Integer> set){
        if(root == null)return null;
        
        root.left = helper(root.left , ans , set);
        root.right = helper(root.right , ans, set);
        
        if(set.contains(root.val)){
            if(root.left != null){
                ans.add(root.left);
            }
            if(root.right != null){
                ans.add(root.right);
            }
            return null;
        }
        
        return root;
    }
}