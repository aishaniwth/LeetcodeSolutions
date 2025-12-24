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
    public ListNode middleNode(ListNode head) {
        int count = 0 ; 
        ListNode curr = head ;
        while(curr!=null){
            count++;
            curr = curr.next;            
        }
int k = 0 ;
ListNode c2 = head;
        while(k<count/2){
c2=c2.next;
k++;
        } return c2;
        
    }
}