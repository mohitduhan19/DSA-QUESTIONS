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
    ListNode th = null;
    ListNode tt = null;
    
    public void addfirst(ListNode node){
        if(th == null){
            th = node;
            tt = node;
        }else{
            node.next = th;
            th = node;
        }
    }
    public int len(ListNode head){
        if(head == null)return 0;
        int size = 0;
        
        while(head !=  null){
            head = head.next;
            size++;
        }
        return size;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null)return null;
        ListNode curr = head , oh = null , ot = null;
        int length = len(head);
        if(length == 1){
            return head;
        }
        while(length >= k){
            int temp = k;
            while(temp-- > 0){
                ListNode forw = curr.next;
                curr.next = null;
                addfirst(curr);
                curr = forw;
            }
            if(oh == null){
            oh = th;
            ot = tt;
            }else{
                ot.next = th;
                ot = tt;
            }
           th = null;
            tt = null;
            length -= k; 
       }
        
        ot.next = curr;
        return oh;
    }
}