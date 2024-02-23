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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root==null || p==null || q==null){
            return null;
        }

        TreeNode result = findLCA(root,p,q);
        if(result==p){
            //if 
            return findLCA(p,q,q)!=null? result: null;
        }else if(result==q){
             return findLCA(q,p,p)!=null? result: null;
        }
        return result;

        

    }


    public TreeNode findLCA(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root==null || root==p || root==q){
            return root;
        }

        TreeNode left =  findLCA(root.left, p, q);
        TreeNode right =  findLCA(root.right, p, q);

        //System.out.println(left.val + "left");
       // System.out.println(right.val + "right");

        if(left==null){
            return right;
        }else if(right==null){
            return left;
        }else{
            return root;
        }

    }
}