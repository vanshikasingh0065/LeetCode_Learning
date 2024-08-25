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
    public ListNode frequenciesOfElements(ListNode head) {
        ListNode freq = new ListNode();
        ListNode freqNext = new ListNode();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ListNode temp = head;
      while (temp != null) {
            map.put(temp.val, map.getOrDefault(temp.val, 0) + 1);
            temp = temp.next;
        }
        
        //now iterating over the map
       ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            current.next = new ListNode(entry.getValue());
            current = current.next;
        }
        return dummy.next;
    }
}