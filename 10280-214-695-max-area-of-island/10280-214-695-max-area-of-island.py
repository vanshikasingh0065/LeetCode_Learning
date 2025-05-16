class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:

        n = len(grid)
        m = len(grid[0])
        count=0
        
        maxArea =0
        vis = [[0]*m for _ in range(n)]

        for row in range(n):
            for col in range(m):

                if not vis[row][col] and grid[row][col]==1:
                    area = self.dfs(grid, vis, row, col)
                    maxArea = max(maxArea, area)

        return maxArea
                    

    def dfs(self, grid, vis, row, col):
        x = len(grid)
        y = len(grid[0])
        vis[row][col]=1
        area =1

        directions = [[0,1],[0,-1], [1,0],[-1,0]]

        for a,b in directions:
            nr = row+a
            nc = col+b

            if nr>=0 and nc>=0 and nr<x and nc<y and not vis[nr][nc] and grid[nr][nc]==1:
                area += self.dfs(grid, vis, nr, nc)

        return area


        