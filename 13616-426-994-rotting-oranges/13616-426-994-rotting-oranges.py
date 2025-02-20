class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        n = len(grid)
        m = len(grid[0])

        # create a visited

        vis = [[0] * m for _ in range(n)]

        # create a queue and add all the rotton oranges in that with the timestamp

        queue = deque()

        for i in range(n):
            for j in range(m):
                if grid[i][j] == 2:
                    # means rotton. push it into the queye
                    queue.append((i, j, 0))
                    vis[i][j] = 1
                else:
                    vis[i][j] = 0

        directions = [[0, 1], [0, -1], [1, 0], [-1, 0]]

        tm = 0
        while queue:
            row, col, time = queue.popleft()
            print(row, col, time)
            tm = max(tm, time)
            for r, c in directions:
                nr = row + r
                nc = col + c

                if (
                    nr >= 0
                    and nr < n
                    and nc >= 0
                    and nc < m
                    and grid[nr][nc] == 1
                ):
                    # mark it as rottom
                    vis[nr][nc] = 1
                    grid[nr][nc] = 2
                    # push it into the queue
                    queue.append((nr, nc, time + 1))

        for i in range(n):
            for j in range(m):
                if grid[i][j] == 1 and not vis[i][j]:
                    return -1
            
        return tm
