/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
};
*/

class Solution {
    public int[] toArray(Node head) {
        
        Node temp = head;
        Node pass = head;
        int size =0;
        while(pass!=null){
            pass = pass.next;
            size++;
        }
        
        int[] arr = new int[size];
        int i=0;
        
        while(temp!=null){
            arr[i] = temp.val;
            i++;
            temp = temp.next;
        }
        return arr;
    }
}