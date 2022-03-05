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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int mindist = Integer.MAX_VALUE;
        ListNode prev = head , curr = head.next;
        int firstminidx = -1 , prevminidx = -1 , idx = 1;
        
        while(curr.next != null){
            if(curr.val > prev.val && curr.val > curr.next.val || curr.val < prev.val && curr.val < curr.next.val){
                if(firstminidx == -1)firstminidx = idx;
                
                if(prevminidx != -1)
                    mindist = Math.min(mindist , idx - prevminidx);
                
                prevminidx = idx;
            }
            
            prev = curr;
            curr = curr.next;
            idx++;
        }
        
        if(mindist == Integer.MAX_VALUE)return new int[]{-1 , -1};
        
        return new int[]{mindist , prevminidx - firstminidx};
    }
}