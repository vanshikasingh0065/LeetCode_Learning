class Solution:
    def countComponents(self, n: int, edges: List[List[int]]) -> int:
        m = len(edges)
        vis =[0]*n
        count=0

        adj = {i:[] for i in range(n)}
        for u,v in edges:
            adj[u].append(v)
            adj[v].append(u)

        for i in range(n):
            if not vis[i]:
                count+=1
                self.dfs(i,adj,vis, n)
        
        return count
    
    def dfs(self,node,adj,vis, n):
        vis[node] =1

        for j in adj[node]:
            if not vis[j]:
                self.dfs(j,adj,vis, n)
    

        