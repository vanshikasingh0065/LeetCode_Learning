class Solution:
    def findJudge(self, n: int, trust: List[List[int]]) -> int:

        adj = [[] for _ in range(n+1)]
        indegree= [0]*(n+1)

        for c1,c2 in trust:
            adj[c1].append(c2)
            indegree[c2]+=1
        
        for i in range(1,n+1):
            if indegree[i] == n - 1 and not adj[i]:
                return i


        return -1