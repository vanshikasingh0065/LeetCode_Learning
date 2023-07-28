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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode tn = new TreeNode();
        TreeNode old = root;
        int left=-1;
       // int right=-1;
        
        if(root==null){
            root = new TreeNode(val);
           return root;
        }
        while(root!=null){
            if(root.val>val){
                // move to the left
                 tn = root;
                 left=0;
                 root = root.left;
                
            }else{
                //move to the right
                 tn = root;
                left =1;
                 root = root.right;
            }
         }
        if(left==0){
            tn.left = new TreeNode(val);
        }else if(left==1){
            tn.right = new TreeNode(val); 
        }
        
        return old;   
        
    }
    
    
}