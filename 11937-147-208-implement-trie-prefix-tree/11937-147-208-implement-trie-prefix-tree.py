class Node:

    def __init__(self):
        self.links = [None]*26
        self.flag = False

    
    def containsKey(self,ch):
        return self.links[ord(ch)-ord('a')] is not None

    def put(self, ch, node):
        self.links[ord(ch)-ord('a')]  = node

    def get(self,ch):
        return self.links[ord(ch)-ord('a')] 
        
    def setEnd(self):
        self.flag = True

    def isEnd(self):
        return self.flag
    



class Trie:

    def __init__(self):
        self.node = Node()
        

    def insert(self, word: str) -> None:
        node = self.node
        for k in word:
            print(k)
            if not node.containsKey(k):
                #then we put
                node.put(k,Node())
            
            #move to next node
            node = node.get(k)
        
        return node.setEnd()


    def search(self, word: str) -> bool:
        node = self.node
        for k in word:
            if not node.containsKey(k):
                return False
            node = node.get(k)
            
        return node.isEnd()
            

    def startsWith(self, prefix: str) -> bool:
        node = self.node
        for k in prefix:
            if not node.containsKey(k):
                return False
            node = node.get(k)

        return True
        


# Your Trie object will be instantiated and called as such:
# obj = Trie()
# obj.insert(word)
# param_2 = obj.search(word)
# param_3 = obj.startsWith(prefix)