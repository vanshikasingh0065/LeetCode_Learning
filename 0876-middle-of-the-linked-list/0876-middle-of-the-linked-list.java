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
    public ListNode middleNode(ListNode head) {
        // first we find the length of the linkedlist
        ListNode ans = new ListNode(0);
        ListNode dummy = ans;
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        

        int check = count/2+1;
        temp = head;
        while(temp!=null){
            //we are refucung the temp here
            check--;
            if(check==0){
                break;
            }
            temp = temp.next;
            
        }

        return temp;
    }
}