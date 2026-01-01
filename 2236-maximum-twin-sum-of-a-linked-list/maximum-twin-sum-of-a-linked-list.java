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
        ListNode slow = head ;
        ListNode fast = head ; 
        while(fast !=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode curr=slow;
        ListNode prev = null;
        while (curr!=null){
            ListNode next = curr.next;
            curr.next=prev; 
            prev=curr;
            curr=next;
        }

ListNode ptr1=head;
ListNode ptr2=prev;
int sum =-1;
while(ptr1!=null && ptr2!=null){
sum=Math.max(sum,ptr1.val+ptr2.val);
ptr1=ptr1.next;
ptr2=ptr2.next;

}

return sum ;



    }
}