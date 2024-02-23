/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode[] nodes) {
        
        if(root==null || nodes.length==0){
            return null;
        }
        
        
        for(TreeNode node : nodes){
            if(root==node){
                return node;
            }
        }
        
        TreeNode left = lowestCommonAncestor( root.left,  nodes);
        TreeNode right = lowestCommonAncestor( root.right, nodes);
        
        if(left==null){
            return right;
        }else if(right==null){
            return left;
        }else{
            return root;
        }
        
    }
}