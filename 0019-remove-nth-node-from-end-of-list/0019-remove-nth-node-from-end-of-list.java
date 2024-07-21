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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //nth node from the end of the list
        ListNode res = new ListNode(0,head);
        ListNode dummy = res;
        
        // head moves the end - Refer this video
        // https://www.youtube.com/watch?v=D56o6uCaVJM&ab_channel=CodingNinja
        
        for(int i=0; i<n; i++){
            head = head.next;
        }
        
        while(head!=null){
             head = head.next;
             dummy = dummy.next;
        }
        
        // dummmy is now starnding at tthe oone spot before the one to be stopped
        
        dummy.next = dummy.next.next;
        return res.next;  
    }
}