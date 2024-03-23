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
    public ListNode deleteDuplicates(ListNode head) {
           ListNode dummy = new ListNode(-1);
            dummy.next = head;
            ListNode curr = dummy;
        
        while(curr!=null){
            if(curr.next==null){
              break;  
            }
            
            if(curr.next.next!=null && (curr.next.val == curr.next.next.val)){
                if(curr.next.next.next !=null && (curr.next.next.val!=curr.next.next.next.val)){
                    curr.next= curr.next.next.next;
                }else if(curr.next.next.next ==null){
                    curr.next = curr.next.next.next;
                }
                else {
                    curr.next.next = curr.next.next.next;
                }
            }else{
                curr = curr.next;
            }
        }
       return dummy.next; 
        
    }
}