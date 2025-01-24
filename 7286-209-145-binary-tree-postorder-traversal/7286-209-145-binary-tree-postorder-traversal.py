# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def postorderTraversal(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: List[int]
        """
        res =[]
        self.traverse(root,res)
        return res

    def traverse(self,root,res):
        if root is None:
            return 
        self.traverse(root.left,res)
        self.traverse(root.right,res)
        res.append(root.val)
        