/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public void recusrion(TreeNode root, int level, List<Integer> res) {
        if (root == null) {
            return;
        }

        if (res.size() < level) {
            res.add(root.val);
        }
        // Each time, we increase the level by 1 while going down, so each time, since
        // it is right view, so we take right view first and if it is not found, then we
        // take the left viw.
        recusrion(root.right, level + 1, res);
        recusrion(root.left, level + 1, res);
    }

    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> list = new ArrayList<Integer>();

        recusrion(root, 1, list);

        return list;

    }
}