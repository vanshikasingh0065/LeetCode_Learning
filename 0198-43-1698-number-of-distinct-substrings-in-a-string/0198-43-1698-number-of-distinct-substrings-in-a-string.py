class Node:
    def __init__(self):
        self.links = [None]*26

    def containsKey(self,ch):
        return self.links[ord(ch)-ord('a')] is not None

    def put(self,ch,node):
        self.links[ord(ch)-ord('a')]=node

    def get(self,ch):
        return self.links[ord(ch)-ord('a')]

class Solution:
    def __init__(self):
            self.root = Node()

    def countDistinct(self, s: str) -> int:
        count=0
        
        for i in range(len(s)):
            node = self.root
            for j in range(i,len(s)):
                if not node.containsKey(s[j]):
                    node.put(s[j], Node())
                    count+=1
                node = node.get(s[j])
            
        return count
            
                    


        