class Solution:
    def isBipartite(self, graph: List[List[int]]) -> bool:
        #we are given adj list
        #creating a color arrat
        n = len(graph)
        color = [-1]*n

        for i in range(n):
            if color[i]==-1:
                if(self.dfs(i,0, graph,color)==False):
                    return False

        return True

    def dfs(self,node,col, graph, color):
        color[node]=col
        for b in graph[node]:
            if color[b]==-1:
                if(self.dfs(b,not col, graph, color)==False):
                    return False
                    
            else:
                if color[b]==col:
                    return False



