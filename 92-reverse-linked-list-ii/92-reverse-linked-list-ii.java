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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null)return head;
        if(left == right)return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev1 = null , curr = dummy;
        
        for(int i = 0; i < left;i++){
            prev1 = curr;
            curr = curr.next;
        }
        
        ListNode prev2 = prev1 , curr2 = curr;
        for(int i = left; i <= right;i++){
            ListNode ahead = curr2.next;
            curr2.next = prev2;
            prev2 = curr2;
            curr2 = ahead;
        }
        prev1.next = prev2;
        curr.next = curr2;
        return dummy.next;
    }
}