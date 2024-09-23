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
      List<Integer> list = new ArrayList<Integer>();
    public Solution(ListNode head) {
        
       // Random random = new Random();
        ListNode temp = head;
        while (temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
    }
    
    public int getRandom() {
       double random=Math.random()*list.size();
        return list.get((int)random);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */