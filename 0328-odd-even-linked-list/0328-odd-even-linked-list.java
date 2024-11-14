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
    public ListNode oddEvenList(ListNode head) {
        
        
        if(head==null || head.next ==null){
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next; //Memozation
        
        //Doing it in one loop
        while(even!=null && even.next!=null){
            odd.next = odd.next.next; //changing the links
            even.next = even.next.next;
            
            odd = odd.next;
            even = even.next;
            
            
        }
        odd.next = evenHead;
        return head;
        
        
    }
}