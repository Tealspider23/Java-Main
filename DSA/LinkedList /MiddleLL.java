Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

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
       ListNode fast;
       ListNode temp = head;
       ListNode slow; 
       fast=slow=head;
       int len=0;
       while(temp!=null){
           temp=temp.next;
           len++;
       }


    while(fast.next!=null && fast.next.next!=null){
        slow=slow.next;
        fast=fast.next.next;   
    }
    if(len%2==0){
        return slow.next;
    }
    else{
        return slow;
    }
}
}
