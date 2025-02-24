"""
# Definition for a Node.
class Node:
    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
"""


class Solution:
    #create a linkedlist

    def treeToDoublyList(self, root: 'Optional[Node]') -> 'Optional[Node]':
        #inorder traversal
        if(root==None):
            return None
        self.first=None
        self.last=None

        self.traverse(root)
        self.first.left = self.last
        self.last.right= self.first

        return self.first


    def traverse(self,root):
        if root==None:
            return
        self.traverse(root.left)
        if self.last:
            self.last.right = root
            root.left = self.last
        else:
            self.first = root
        self.last = root
        self.traverse(root.right)
        