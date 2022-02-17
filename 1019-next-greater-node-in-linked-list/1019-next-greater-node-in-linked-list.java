/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list =  new ArrayList<>();
        
        ListNode curr = head;
        while(curr!=null){
            list.add(curr.val);
            curr = curr.next;
        }
        
        int[] res = new int[list.size()];
        Stack<Integer> stk = new Stack<>();
        for(int i = 0;i < list.size();i++){
            while(stk.size() > 0 && list.get(stk.peek()) < list.get(i)){
                res[stk.pop()] = list.get(i);
            }
            stk.push(i);
        }
        return res;
    }
}