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
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(-5001);
        ListNode preinsert;
        ListNode toinsert = dummy;
        dummy.next =  head;
        ListNode curr = head;
        
        
        while(curr != null && curr.next != null){
            if(curr.val <= curr.next.val){
                curr= curr.next;
            }else{
                toinsert = curr.next;
               preinsert = dummy;
            while(preinsert.next.val < toinsert.val){
                 preinsert = preinsert.next; 
            }
            curr.next = toinsert.next;
            
            toinsert.next = preinsert.next;
            preinsert.next = toinsert;
            }
        }
        return dummy.next;
       
        
    }
}