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
    public void inorder(TreeNode root , List<Integer> arr){
       if(root == null)return;
       inorder(root.left , arr);
        arr.add(root.val);
        inorder(root.right , arr);
    }
    public boolean findTarget(TreeNode root, int target) {
        if(root == null)return false; 
        List<Integer> arr = new ArrayList<>();
        inorder(root , arr);
        
        int left = 0 , right = arr.size()- 1;
        while(left < right){
            int sum = arr.get(left) + arr.get(right);
            if(sum == target)return true;
            if(sum < target)left++;
            else right--;
        }
        return false;
    }
}