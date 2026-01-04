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
        ListNode curr = head;
        ListNode dummy = new ListNode (-1);
        ListNode ans = dummy;
        int sum = 0 ; 
        while(curr.next!=null && curr.val==0){
curr=curr.next;
            while(curr.val!=0){
                sum = sum+curr.val;
                curr=curr.next;
            }
            ans.next=new ListNode(sum);
            ans=ans.next;
            sum=0;
        } return dummy.next;
        
    }
}