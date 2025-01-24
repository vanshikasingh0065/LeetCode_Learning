# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        if root is None:
            return False
        return self.check(root.left,root.right)
        
    def check(self,left,right):
        if(left==None or right==None):
            return left==right
        if(left.val!=right.val):
            return False
        #when we move compare, we check that left moves to its left and Right Moves to its roight
        #mirror image
        return self.check(left.left,right.right) and self.check(left.right,right.left)
        