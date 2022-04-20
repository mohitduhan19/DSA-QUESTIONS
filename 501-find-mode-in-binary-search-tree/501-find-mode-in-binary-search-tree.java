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
    
    int count = 1 , max = 0;
    Integer prev = null;
   
    public void inorder(TreeNode root , List<Integer> list){
        if(root == null)return;
        inorder(root.left , list);
        if(prev != null){
            if(prev == root.val){
                count++;
            }else{
                count = 1;
            }
        }
        if(count > max){
            max = count;
            list.clear();
            list.add(root.val);
        }else if(count ==  max){
            list.add(root.val);
        }
        prev = root.val;
        inorder(root.right ,list);
    }
    public int[] findMode(TreeNode root) {
        List<Integer> list = new ArrayList<>(); 
       
        inorder(root,list);
        
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size();i++){      
                ans[i] = list.get(i);
            
        }
            return ans;
    }
}