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
    public String gameResult(ListNode head) {
        int even =0;
            int odd=0;
        
        ListNode temp =head;
        while (temp!=null){
            
            if(temp.val>temp.next.val){
                even++;
            }else{
                odd++;
            }
            temp = temp.next.next;
        }
        
        if(odd>even){
            return "Odd";
        }else if(odd==even){return "Tie";}else
            {
            return "Even";
        }
    }
}