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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null|| head.next==null){
            return head;
        }
        //2 pointer solution will be good here
        ListNode fast = head, slow = head, p = null;
        for(int i=1; i<k; i++){
            fast = fast.next;
        } 
         p = fast;
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        
        int h = slow.val;
        slow.val = p.val;
        p.val = h;
        
        return head;
    }
}