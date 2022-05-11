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
class Solution 
{
    public List<Integer> rightSideView(TreeNode root) 
    {
        Queue<TreeNode> que = new ArrayDeque<>();
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null)
        {
            return ans;
        }
        que.add(root);
        while (que.size() != 0) 
        {
            int size = que.size();
            ans.add(que.peek().val);
            while (size-- > 0) 
            {
                TreeNode rn = que.remove();

                if (rn.right != null)
                    que.add(rn.right);
                if (rn.left != null)
                    que.add(rn.left);
            }

        }
        return ans;
    }
}