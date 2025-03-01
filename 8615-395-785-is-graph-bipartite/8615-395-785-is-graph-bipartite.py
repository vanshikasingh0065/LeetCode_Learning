class Solution:
    def isBipartite(self, graph: List[List[int]]) -> bool:
        n= len(graph)
        color= [-1]*n
        for i in range(n):
            if(color[i]==-1):
                if(self.check(i,graph,color)==False):
                    return False

        return True


    def check(self,start,graph, color):
        queue= deque()
        queue.append(start)
        color[start]=0

        while queue:
            node = queue.popleft()
            col = color[node]
            for k in graph[node]:
                
                if(color[k]==-1):
                    color[k]= 1- col
                    queue.append(k)
                else:
                    if(color[k]==col):
                        return False
                    
        return True

        