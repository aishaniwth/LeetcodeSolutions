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
        

int sum = -1;
int carry = 0 ;
ListNode curr1 = l1;
ListNode curr2=l2;
ListNode ans=new ListNode();
ListNode ptr = ans ;
while(curr1!=null && curr2!=null){
    sum = (curr1.val+curr2.val) + carry;
    carry=0;
    if(sum>=10){ 
    carry=1;
    }
    if(curr1.next==null && curr2.next==null && sum>=10){
ans.next=new ListNode(sum%10);
ans.next.next=new ListNode(1);
curr1=curr1.next ;
    curr2=curr2.next;
break;
    }
ans.next=new ListNode(sum%10);
ans=ans.next;
    curr1=curr1.next ;
    curr2=curr2.next;


}

    while(curr1!=null){
        sum=curr1.val+carry;
        carry=0;
        if(sum>=10){carry=1;}
        if(curr1.next==null && sum>=10){
            ans.next=new ListNode (sum%10);
            ans.next.next= new ListNode (1);
            break;

        }
        ans.next= new ListNode(sum%10);
        ans=ans.next;
        curr1=curr1.next;

    }


 while(curr2!=null){
        sum=curr2.val+carry;
        carry=0;
        if(sum>=10){carry=1;}
        if(curr2.next==null && sum>=10){
            ans.next=new ListNode (sum%10);
            ans.next.next= new ListNode (1);
            break;

        }
        ans.next= new ListNode(sum%10);
        ans=ans.next;
        curr2=curr2.next;

    }


return ptr.next;


    }
}