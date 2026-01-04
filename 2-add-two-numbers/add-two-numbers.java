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
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode ans = new ListNode();
        ListNode dummy = ans;
        int sum = 0 ;
        int carry = 0 ;
        while(curr1!=null || curr2!=null || carry ==1){
if(curr1 != null){
    sum=sum+curr1.val;
    curr1=curr1.next;
}
if(curr2 != null){
    sum=sum+curr2.val;
    curr2=curr2.next;
}

sum=sum+carry ; 
if(sum>=10){carry=1;}
else {carry=0;}
ans.next=new ListNode (sum%10);
ans=ans.next;
sum=0;

        }      
    return dummy.next;}
}