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
  
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy = new ListNode(0 , head);
        dummy.next = head;
        ListNode fast = dummy ,slow = dummy;
        ListNode curr = head;
        int size = 0;
        while(curr!=null){
            curr = curr.next;
            size++;
        }
        
        for(int i = 1;i<=k;i++){
            fast = fast.next;
        }
        int t = size -k +1;
       for(int i = 1;i<= t;i++){
           slow = slow.next;
       }
        int temp = slow.val;
        slow.val= fast.val;
        fast.val = temp;
        
        return dummy.next;
            
        
    }
}