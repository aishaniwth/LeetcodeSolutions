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
        ListNode sum = null ; 
        while(curr.next!=null && curr.val==0){
curr=curr.next;
sum=curr;

            while(curr.val!=0){
                curr=curr.next;
                sum.val=sum.val+curr.val;
                
                
            }sum.next=null;
            ans.next=sum;
            ans=ans.next;
            
        } return dummy.next;
        
    }
}