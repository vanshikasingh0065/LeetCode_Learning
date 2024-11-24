/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
};
*/

class Solution {
    public int[] toArray(Node node) {
      final List<Integer> right = new ArrayList<>(), left = new ArrayList<>();
        Node curr = node;

        while(curr != null) {
            right.add(curr.val);
            curr = curr.next;
        }

        curr = node.prev;

        while(curr != null) {
            left.add(curr.val);
            curr = curr.prev;
        }

        final int[] result = new int[left.size() + right.size()];

        int idx = 0;

        for(int i = left.size() - 1; i >= 0; --i)
            result[idx++] = left.get(i);

        for(int i = 0; i < right.size(); ++i)
            result[idx++] = right.get(i);

        return result;  
    }
}