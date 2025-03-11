class Solution:
    def eventualSafeNodes(self, graph: List[List[int]]) -> List[int]:
        #create an aj list
        n = len(graph)
        m = len(graph[0])
        adj = [[] for _ in range(n)]
        for i in range(n):
            for k in graph[i]:
                adj[i].append(k)

        b = len(adj)
        vis = [0]*b
        pathvis= [0]*b
        check = [0]*b
        safe = []

        for i in range(b):
            if not vis[i]:
                #call dfs
                self.dfs(i, vis,adj,pathvis,check)

        for i in range(b):
            if check[i]==1:
                safe.append(i)

        return safe
    
    def dfs(self,node,vis,adj,pathvis,check):
        vis[node]=1
        pathvis[node]=1

        for it in adj[node]:
            if not vis[it]:
                if(self.dfs(it, vis,adj,pathvis,check)):
                    check[it]=0
                    return True
            elif pathvis[it]:
                check[it]=0
                return True
        
        check[node]=1
        pathvis[node]=0
        return False




        