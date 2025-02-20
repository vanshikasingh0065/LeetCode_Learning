class Solution:
    def islandPerimeter(self, grid: List[List[int]]) -> int:
        # there is only one island
        n = len(grid)
        m = len(grid[0])
        vis = grid

        directions = [[0, 1], [0, -1], [1, 0], [-1, 0]]
        count = 0

        for i in range(n):
            for j in range(m):
                if grid[i][j] == 1:
                    for r, c in directions:
                        nr = r + i
                        nc = c + j
                        print(nr)

                        if (
                            nr < 0
                            or nr >= n
                            or nc < 0
                            or nc >= m
                            or grid[nr][nc] == 0
                        ):
                            count += 1
        return count
