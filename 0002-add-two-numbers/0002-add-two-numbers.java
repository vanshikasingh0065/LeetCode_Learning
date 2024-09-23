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
         ListNode dummyHead = new ListNode(0);
        ListNode temp = dummyHead;
        ListNode temp1= l1;
        ListNode temp2 = l2;
        int val1=0;
        int val2 =0;
        int sum =0;
        int digit=0;
        int carry =0;
        
        while(temp1!=null || temp2!=null || carry!=0){
         val1 = temp1!=null? temp1.val: 0;
         val2 = temp2!=null? temp2.val : 0;
         sum = val1+val2+carry;
         digit = sum%10;
        carry = sum/10;
                    
           ListNode node = new ListNode(digit);
            temp.next = node;
            temp = temp.next;
            
            temp1= (temp1!=null)? temp1.next: null;
            temp2= (temp2!=null)? temp2.next: null;
            
        }
        //now we have to put this in a linkedlist
        
        ListNode result = dummyHead.next;
        dummyHead.next = null;
        
        return result;
        
        
    }
}