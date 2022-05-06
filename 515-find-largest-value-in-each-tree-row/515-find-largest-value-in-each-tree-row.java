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
    public List<Integer> largestValues(TreeNode root) {
        
   
        List<Integer> res = new ArrayList<>() ;
             if(root==null)return res ;
        Queue<TreeNode> q = new LinkedList<>() ;
        
        res.add(root.val) ;
        q.add(root) ;
        
        while(!q.isEmpty()){
            
            int size = q.size() ;
            boolean flag = false ;
            int max = Integer.MIN_VALUE;
            for(int i=0 ; i<size ;i++){
                TreeNode curr = q.remove() ;
              
                if(curr.left!=null){
                      if(curr.left.val>=max){max=curr.left.val ; flag = true ;}
                    q.add(curr.left) ;
                }
                if(curr.right!=null){
                      if(curr.right.val>=max){max=curr.right.val ; flag = true ;}
                    q.add(curr.right) ;
                }
            }
            if(flag) 
            res.add(max) ;
        }
        
        
        return res ;
    }
}
