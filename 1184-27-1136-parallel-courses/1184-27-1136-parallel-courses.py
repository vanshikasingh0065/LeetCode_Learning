class Solution:
    def minimumSemesters(self, num: int, relations: List[List[int]]) -> int:
        #create adj list
        m = len(relations)
        n = len(relations[0])

        adj = [[] for _ in range(num+1)]

        for i,j in relations:
                adj[i].append(j)
                #adj[j].append(i)

        
        #create indegree
        indegree = [0]*(num+1)

        for i in range(1,num+1):
            for k in adj[i]:
                print(k)
                indegree[k] += 1


        #now we create a queue
        queue = deque()

        #if you have zero indegree, we put you in queue

        for i in range(1,num+1):
            if(indegree[i]==0):
                queue.append(i)
        
        count=0
        sem=0
        while queue:
            sem += 1  # New semester starts
            for _ in range(len(queue)):  # Process all nodes in the current level
                node = queue.popleft()
                count+=1
                for k in adj[node]:
                    indegree[k]-=1
                    if(indegree[k]==0):
                         queue.append(k)

        return sem if count == num else -1
          # Return -1 if cycle exists



        