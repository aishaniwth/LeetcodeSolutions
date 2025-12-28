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
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head ;
        ListNode fast = head; 
        ListNode prevSlow = null;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            prevSlow=slow;
            slow=slow.next;

        } if (prevSlow==null){return null;}
        prevSlow.next=slow.next;
        return head;
        
    }
}