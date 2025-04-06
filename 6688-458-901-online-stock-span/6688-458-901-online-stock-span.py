class StockSpanner(object):


    def __init__(self):
        self.index = -1
        self.stack = deque()
        

    def next(self, price):
        """
        :type price: int
        :rtype: int
        """

        self.index +=1
        while self.stack and self.stack[-1][0]<=price:
            self.stack.pop()

        val = -1
        if self.stack:
            val = self.stack[-1][1]

        ans = self.index - val

        self.stack.append((price,self.index))

        return ans
        


# Your StockSpanner object will be instantiated and called as such:
# obj = StockSpanner()
# param_1 = obj.next(price)