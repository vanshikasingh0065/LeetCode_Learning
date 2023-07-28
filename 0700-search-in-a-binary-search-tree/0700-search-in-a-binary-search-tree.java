/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        
        TreeNode tn = null;
        
        while(root!=null){
            if(root.val>val){
                //move left
              //  tn = root;
                root=root.left;
            }else if(root.val<val){
               // tn = root;
                root=root.right;
                //move right
            }else if(root.val == val){
                //we have hot the node and found it
                tn = root;
                break;
            }
        }
        
        if(tn==null){
            return tn;
        }
        
        
        return tn;
    }
}