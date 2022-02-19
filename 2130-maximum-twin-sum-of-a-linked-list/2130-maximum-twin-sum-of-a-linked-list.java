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
    public int pairSum(ListNode head) {
        ListNode curr = head;
        ListNode curr1 = head;
        int size  = 0 , j =0 , res = 0;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        
        int[] ans = new int[size];
        
        while(curr1.next != null){
            ans[j] = curr1.val;
            j++;
            curr1 = curr1.next;
        }
        ans[j] = curr1.val;
        
        for(int i = 0; i< ans.length/2;i++){
            int sum = ans[i] + ans[ans.length - 1 - i];
            res = Math.max(res , sum);
        }
        return res;
    }
}