class Solution:
    def validTree(self, n: int, edges: List[List[int]]) -> bool:
        #we have to find that count does not go to zero

        if len(edges) != n - 1: return False

        adj = [[] for _ in range(n)]
        #populate adj
        for a,b in edges:
            adj[a].append(b)
            adj[b].append(a)

        vis= [0]*n
        count=0
        seen = set()
        #seen is the edges thar we have seen

        def dfs(node):
            if node in seen:
                return 
            seen.add(node)
            for k in  adj[node]:
                dfs(k)
        
        dfs(0)
        return len(seen)==n
        #then its a valid tree



        