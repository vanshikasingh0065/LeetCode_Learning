class Solution:
    def alienOrder(self, words: List[str]) -> str:
        adj = {c: [] for word in words for c in word}

        n = len(words)
        for i in range(0,n-1):
            s1 = words[i]
            s2 = words[i+1]
            slen = min(len(s1),len(s2))

            for j in range(0,slen):
                if len(s1) > len(s2) and s1[:slen] == s2[:slen]: return ""
                if s1[j]!=s2[j]:
                    adj[s1[j]].append(s2[j])
                    #adj[ord(s1[j]) - ord('a')].append(ord(s2[j]) - ord('a'))
                    break

        topo = self.toposort(adj,words,n)
        return "".join(topo) if len(topo) == len(adj) else ""
            

    def toposort(self, adj, words, n):
        indegree = {c: 0 for c in adj}
        for u in adj:
            for v in adj[u]:
                indegree[v] += 1

        queue = deque([c for c in adj if indegree[c] == 0])
        ''' for u in adj:
            if indegree[u]==0:
                queue.append(u)'''

        topo = []
        while queue:
            node = queue.popleft()
            topo.append(node)
            for k in adj[node]:
                indegree[k]-=1
                if indegree[k]==0:
                    queue.append(k)

        return topo
        



        