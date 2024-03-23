/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode temp = null;

        ListNode node = head;

        while (node != null) {
            // Node doesn't reach end

            temp = node.next;
            node.next = prev;
            prev = node;
            node = temp;

        }

        return prev;
    }
}