class Solution {
   public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
  if(head1 == null) return head2;
  if(head2 == null) return head1;
      
   ListNode dummy = new ListNode(-1);
  
   ListNode head = dummy , tail = dummy;
    while(head1 != null && head2 != null){
        if(head1.val <= head2.val){
            tail.next = head1;
            head1 = head1.next;
        }else{
            tail.next = head2;
            head2 = head2.next;
        }
        tail = tail.next;
    }
    if(head1 != null){
        tail.next = head1;
    }else{
        tail.next = head2;
    }
    return dummy.next;
  }
    
}
 