class Solution:
    def canFinish(self, n: int, prerequisites: List[List[int]]) -> bool:

        #create an adj list
       
        adj = [[] for _ in range(n)]
        for c1,c2 in prerequisites:
            adj[c1].append(c2)
            #adj[c2].append(c1)

        #now we create an indegree for each node

        l = len(adj)
        indegree = [0]*l

        for i in range(l):
            for k in adj[i]:
                indegree[k]+=1

        queue = deque()
        for i in range(l):
            if indegree[i]==0:
                queue.append(i)

        count=0
        while queue:
            node = queue.popleft()
            count+=1
            for k in adj[node]:
                indegree[k]-=1
                if indegree[k]==0:
                    queue.append(k)

        if count==n:
            return True
        else:
            return False



        