class Node:

    def __init__(self):
        self.links = [None]*26
        self.flag = False

    def containsKey(self, ch):
        return self.links[ord(ch) - ord('a')]is not None

    def put(self, ch, node):
        self.links[ord(ch) - ord('a')]=node

    def get(self, ch):
        return self.links[ord(ch) - ord('a')]
    
    def setEnd(self):
        self.flag= True

    def isEnd(self):
        return self.flag
    
    




class Trie:
    def __init__(self):
        self.node = Node()
        

    def insert(self, word: str) -> None:
        node = self.node
        for i in range(len(word)):
            if not node.containsKey(word[i]):
                node.put(word[i],Node())
            node = node.get(word[i])
        
        return node.setEnd()
        
            
    def search(self, word: str) -> bool:
        node = self.node
        #we loop over and check containsKey and when final we check the flag
        for i in range(len(word)):
            if not node.containsKey(word[i]):
                return False
            node = node.get(word[i])

        return node.isEnd()

    def startsWith(self, prefix: str) -> bool:
        node = self.node
        for i in range(len(prefix)):
            if not node.containsKey(prefix[i]):
                return False
            node = node.get(prefix[i])

        return True
        


# Your Trie object will be instantiated and called as such:
# obj = Trie()
# obj.insert(word)
# param_2 = obj.search(word)
# param_3 = obj.startsWith(prefix)