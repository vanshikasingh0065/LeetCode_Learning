class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        m = len(grid)
        n = len(grid[0])

        queue = deque()
        vis = [[0] * n for _ in range(m)]

        for i in range(m):
            for j in range(n):
                if(grid[i][j]==2):
                   queue.append((i,j,0)) 
                   vis[i][j]=2
                else:
                    vis[i][j]=0

        tm=0
        directions =[(0,-1),(0,1),(-1,0),(1,0)]

        while queue:
            row,col,t = queue.popleft()
            tm = max(tm,t)
            for drow,dcol in directions:
                nrow = row+drow
                ncol = col+dcol

                if(nrow>=0 and ncol>=0 and nrow<m and ncol<n and grid[nrow][ncol]==1):
                    queue.append((nrow,ncol,t+1))
                    vis[nrow][ncol]=2
                    grid[nrow][ncol] = 2

        #last check that all the oranges are rotton
        for i in range(m):
            for j in range(n):
                if grid[i][j]==1:
                    return -1

        return tm


        