/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
         if(head==null || head.next==null){return null;}
        ListNode slow = head; 
        ListNode fast = head;
        HashSet<ListNode> set = new HashSet<>();
       
        while(fast!=null && fast.next!=null){
             if(set.contains(slow)){
return slow;
           }set.add(slow);
            slow=slow.next;
            fast=fast.next.next;
          
                  } return null;
        
    }
}