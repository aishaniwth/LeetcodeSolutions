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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right ) {return head;}
        int count = 1 ;
        ListNode curr = head ; 
        ListNode prev = null ; 
        ListNode leftnode = null;
        ListNode rightnode = null;
        ListNode last = null;
        ListNode rev = null;
        while(curr!=null){
if(count==left){
    leftnode =  curr;
    while(count<right){
        curr=curr.next; 
        rightnode=curr;
           
        count++;
    }
    last=rightnode.next;
rightnode.next=null;
 rev = reverse(leftnode);
break;

}
count++;
prev=curr;
curr=curr.next;
        } 
       if(prev!=null){
prev.next=rev;
       
        for(int i = 0 ; i <right-left;i++){
            rev=rev.next;
        }
        rev.next=last;
        return head;} 
        else{ListNode headrev=rev;
             for(int i = 0 ; i <right-left;i++){
            rev=rev.next;
        }
        rev.next=last;
        return headrev;
        }

    }


    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null; 
        while(curr!=null){
            ListNode next = curr.next;
            curr.next=prev;
            prev = curr;
            curr=next;
        } return prev;
    }
}