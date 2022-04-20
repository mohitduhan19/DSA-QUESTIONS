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
class BSTIterator {
    Stack<TreeNode> stk;
    public BSTIterator(TreeNode root) {
        stk = new Stack<>();
        addAllLeft(root);
    }
    private void addAllLeft(TreeNode node){
        while(node != null){
            this.stk.push(node);
            node = node.left;
        }
    }
    public int next() {
        TreeNode topNode = this.stk.pop();
        addAllLeft(topNode.right);
        return topNode.val;
    }
    
    public boolean hasNext() {
       return this.stk.size() != 0;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */