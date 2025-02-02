

class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        n = len(grid)
        m = len(grid[0])
        vis = [[0] * m for _ in range(n)]
        count = 0
        for i in range(n):
            for j in range(m):
                if vis[i][j] == 0 and grid[i][j] == '1':
                    count += 1
                    self.bfs(i, j, vis, grid)

        return count

    def bfs(self, row, col, vis, grid):
        vis[row][col] = 1
        my_queue = deque()
        my_queue.append((row, col))
        n = len(grid)
        m = len(grid[0])

        directions = [(0,-1),(1,0),(0,1),(-1,0)]
        while my_queue:
            row,col = my_queue.popleft()

            for delrow, delcol in directions: 
                    if delrow == 0 and delcol == 0:
                        continue 
                    nrow = row + delrow
                    ncol = col + delcol

                    if (
                        nrow >= 0
                        and ncol >=0
                        and nrow < n
                        and ncol < m
                        and grid[nrow][ncol] == '1'
                        and vis[nrow][ncol] == 0
                    ):
                        vis[nrow][ncol] = 1
                        my_queue.append((nrow, ncol))
