class Solution:
    def findOrder(self, n: int, prerequisites: List[List[int]]) -> List[int]:
        adj = [[] for _ in range(n)]
        for c1,c2 in prerequisites:
            adj[c2].append(c1)
        
        indegree = [0]*n
        for i in range(n):
            for k in adj[i]:
               indegree[k]+=1

        queue = deque()

        for i in range(n):
            if(indegree[i]==0):
                queue.append(i)

        topo = []
        while queue:
            node = queue.popleft()
            topo.append(node)

            for k in adj[node]:
                indegree[k]-=1
                if(indegree[k]==0):
                    queue.append(k)

        if(len(topo)==n):
            return topo
        else:
         return []










        
        