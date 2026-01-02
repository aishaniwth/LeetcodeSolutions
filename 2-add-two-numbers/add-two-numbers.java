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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ptr1 = l1;
        ListNode ptr2  = l2;
        ListNode ans = new ListNode();
        ListNode dummy = ans;
        int sum = 0 ; int carry =0 ;
        while(ptr1!=null || ptr2!=null || carry==1){
if(ptr1!=null){
    sum=sum+ptr1.val;
    ptr1=ptr1.next;
}

if(ptr2!=null){
    sum=sum+ptr2.val;
    ptr2=ptr2.next;
}
sum=sum+carry;

carry=sum>=10?1:0;

ans.next = new ListNode(sum%10);
ans=ans.next;

sum=0;


        } return dummy.next ;
        
    }
}