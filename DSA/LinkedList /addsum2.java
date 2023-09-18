//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

//You may assume the two numbers do not contain any leading zero, except the number 0 itself.

/*
**
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
     ListNode dummy = new ListNode(0);
     ListNode tail = dummy;
     int c =0;

     while(l1!=null || l2!=null || c!=0){
         int dig1 = (l1 !=null)?l1.val:0;
         int dig2 = (l2 !=null)?l2.val:0;

         int sum = dig1+ dig2 + c;
         int dig = sum %10;
         c = sum/10;

         ListNode newNode = new ListNode(dig);
         tail.next = newNode;
         tail=tail.next;

         l1 = (l1 != null)?l1.next:null;
         l2 = (l2 != null)?l2.next:null;
     }
     ListNode result = dummy.next;
     dummy.next = null;
     return result ;
}
}
