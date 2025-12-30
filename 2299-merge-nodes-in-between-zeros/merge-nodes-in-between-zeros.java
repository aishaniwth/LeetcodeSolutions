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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr = head ; 
        ListNode dummy = new ListNode (-1);
        ListNode prev = dummy;
        ListNode ans=null;
        while (curr!=null){
            if(curr.val==0){
curr=curr.next;
ans=curr;
while(curr!=null && curr.val!=0){
curr=curr.next;
ans.val=ans.val+curr.val;
}
            } prev.next=ans;
            prev=prev.next;
        } return dummy.next;
    }
}