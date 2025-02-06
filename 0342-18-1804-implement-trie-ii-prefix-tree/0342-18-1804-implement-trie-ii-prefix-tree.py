class Node:

    def __init__(self):
        self.links = [None] * 26
        self.countEndsWith = 0
        self.countStartsWith = 0
        self.flag = False

    def containsKey(self, ch):
        return self.links[ord(ch) - ord("a")] is not None

    def get(self, ch):
        return self.links[ord(ch) - ord("a")]

    def put(self, ch, node):
        self.links[ord(ch) - ord("a")] = node

    def isEnd(self):
        return self.flag
    
    def setEnd(self):
        self.flag = True

    def increaseEnd(self):
        self.countEndsWith += 1

    def increasePrefix(self):
        self.countStartsWith += 1

    def reducePrefix(self):
        self.countStartsWith -= 1

    def deleteEnd(self):
        self.countEndsWith -= 1

    def getEnd(self):
        return self.countEndsWith

    def getStart(self):
        return self.countStartsWith


class Trie:

    def __init__(self):
        self.root = Node()

    def insert(self, word: str) -> None:
        node = self.root

        for ch in word:
            if not node.containsKey(ch):
                node.put(ch, Node())
            node = node.get(ch)
            node.countStartsWith += 1
        node.countEndsWith += 1

        node.isEnd()

    def countWordsEqualTo(self, word: str) -> int:
        node = self.root

        for ch in word:
            if node.containsKey(ch):
                node = node.get(ch)
            else:
                return 0

        return node.getEnd()

    def countWordsStartingWith(self, prefix: str) -> int:
        node = self.root

        for ch in prefix:
            if node.containsKey(ch):
                node = node.get(ch)
            else:
                return 0

        return node.getStart()

    def erase(self, word: str) -> None:
        node = self.root

        for ch in word:
            if node.containsKey(ch):
                node = node.get(ch)
                node.reducePrefix()
            else:
                return

        return node.deleteEnd()


# Your Trie object will be instantiated and called as such:
# obj = Trie()
# obj.insert(word)
# param_2 = obj.countWordsEqualTo(word)
# param_3 = obj.countWordsStartingWith(prefix)
# obj.erase(word)
