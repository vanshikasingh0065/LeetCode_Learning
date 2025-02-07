class Solution:
    def findCircleNum(self, isConnected: List[List[int]]) -> int:
        n = len(isConnected)
        vis = [0] * n
        count = 0
        for i in range(n):
            if not vis[i]:
                count += 1
                self.dfs(isConnected, i, vis)

        return count

    def dfs(self, isConnected, node, vis):
        vis[node] = 1

        for k in range(len(isConnected[node])):
            if not vis[k] and isConnected[node][k]:
                self.dfs(isConnected, k, vis)
