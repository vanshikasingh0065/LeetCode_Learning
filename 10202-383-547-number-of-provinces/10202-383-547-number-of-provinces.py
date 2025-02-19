class Solution:
    def findCircleNum(self, isConnected: List[List[int]]) -> int:
        n = len(isConnected)
        m = len(isConnected[0])

        #print(n)
        adj = [[]*m for _ in range(n)]
        #create an adjacency list foir this= matrix
        for i in range(n):
            for j in range(m):
                if isConnected[i][j]==1 and i!=j:
                    adj[i].append(j)
                    adj[j].append(i)
                    print(adj[i])
                    print(adj[j])
                
    
        count=0
        a = len(adj)
        print(a)

        vis = [0]*a

        for i in range(a):
            if not vis[i]:
                count+=1
                #call dfs here
                self.dfs(i,vis,isConnected, adj)
        

        return count


    def dfs(self,node,vis,isConnected, adj):
        
        vis[node]=1
        for k in adj[node]:
            if not vis[k]:
                self.dfs(k,vis,isConnected, adj)

    

        