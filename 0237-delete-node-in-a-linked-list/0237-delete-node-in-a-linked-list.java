/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        //we copy the value of the next node into the current node
        //We adjust the pointer to skip the next node 
        
       // for example 
        // I had 6, 8, 9, 0
        // remover 8
       // so 9 comes forward and pointer connecting 8 and 9 now connects 9 and 0 since 9 came forward
        
        node.val = node.next.val;
        node.next = node.next.next;
        
    }
}