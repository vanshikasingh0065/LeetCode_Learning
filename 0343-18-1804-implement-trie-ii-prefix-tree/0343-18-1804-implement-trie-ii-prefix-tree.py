class Node:
    def __init__(self):
        self.links = [None]*26
        self.countPrefix=0
        self.endWith =0

    def containsKey(self,ch):
        return self.links[ord(ch)-ord('a')] is not None
    
    def increasePrefix(self):
        self.countPrefix+=1
    
    def increaseEnd(self):
        self.endWith+=1

    def insert(self, ch, node):
        self.links[ord(ch)-ord('a')]= node
    
    def get(self,ch):
        return self.links[ord(ch)-ord('a')]

    def getEnd(self):
        return self.endWith

    def getPrefix(self):
        return self.countPrefix

    def deletePrefix(self):
        self.countPrefix-=1
    
    def deleteEnd(self):
        self.endWith-=1
    




        





class Trie:

    def __init__(self):
        self.root = Node()

    def insert(self, word: str) -> None:
        node = self.root
        for k in word:
            if not node.containsKey(k):
                node.insert(k, Node())
            node = node.get(k)
            node.increasePrefix()
        node.increaseEnd()
        return None


    def countWordsEqualTo(self, word: str) -> int:
        node = self.root
        for k in word:
            if node.containsKey(k):
                node = node.get(k)
            else:
                return 0
        return node.getEnd()

        
    def countWordsStartingWith(self, prefix: str) -> int:
        node = self.root
        for k in prefix:
            if node.containsKey(k):
                node = node.get(k)
            else:
                return 0
        return node.getPrefix()

        

    def erase(self, word: str) -> None:
        node = self.root
        for k in word:
            if node.containsKey(k):
                node = node.get(k)
                node.deletePrefix()
            else:
                return
        node.deleteEnd()
        return None
        
        


# Your Trie object will be instantiated and called as such:
# obj = Trie()
# obj.insert(word)
# param_2 = obj.countWordsEqualTo(word)
# param_3 = obj.countWordsStartingWith(prefix)
# obj.erase(word)