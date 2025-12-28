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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
       
        ListNode dummy = new ListNode(-1000);
         ListNode prev = dummy;
        dummy.next=head;
        while(curr!=null){
            if(curr.val==prev.val){
                curr=curr.next;
                prev.next=curr;
                continue;
            }
            prev=curr;
            curr=curr.next;
        } return dummy.next;
    }
}