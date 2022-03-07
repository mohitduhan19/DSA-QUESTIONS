/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)return ans;
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        
        while(q.size() > 0){
            List<Integer> list = new ArrayList<>();
            Queue<Node> q1 = new ArrayDeque<>();
            
            while(q.size() > 0){
                Node curr = q.remove();
                list.add(curr.val);
                
                for(Node child : curr.children){
                    q1.add(child);
                }
            }
            q = q1;
            ans.add(list);
        }
        
        return ans;
    }
}