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
        int count =0 ;
        ListNode curr = head;
        while(curr!=null){
            count++;
            curr=curr.next;
        } if(count==1){return null; }
        int mid = count/2;
        int check = 0 ;
        ListNode c = head;
while(c!=null){
check++;
if(check==mid){break;}
c=c.next;
}
c.next=c.next.next;
return head ;
    }
}