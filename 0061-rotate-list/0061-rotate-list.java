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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k ==0){
            return head;
        }
        int len = 1;
        ListNode tail = head;

        while (tail.next != null) {
            tail = tail.next;
            len++;
        }
        if (k % len == 0) {
            return head;
        }
        k = k % len;
        tail.next = head;
        // did the join here

        ListNode newListNode = findN(head, len - k);
        head = newListNode.next;
        newListNode.next = null;
        return head;
    }

    public ListNode findN(ListNode temp, int k) {
        int count = 1;
        while (temp != null) {
            if (count == k) {
                return temp;
            }
            temp = temp.next;
            count++;
        }
        return temp;
    }
}