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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0 ; 
        ListNode curr = head;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
      int front = count-n;
      boolean visited=false;
      count=0;
      curr=head;
      ListNode dummy = new ListNode(-1);
      ListNode prev = dummy ; 
      dummy.next=head;
      while(curr!=null){
if(count==front && !visited){
curr=curr.next;
prev.next=curr;
visited=true;
}
else{
    count++;
    prev=curr;
    curr=curr.next;
}

      }   return dummy.next;
    }
}