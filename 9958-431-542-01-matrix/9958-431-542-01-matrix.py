class Solution:
    def updateMatrix(self, mat: List[List[int]]) -> List[List[int]]:
        n = len(mat)
        m = len(mat[0])

        # create a visited and Distr=tance matrix

        vis = [[0] * m for _ in range(n)]
        dis = [[0] * m for _ in range(n)]

        # create a queue and add in that

        queue = deque()

        for i in range(n):
            for j in range(m):
                if mat[i][j] == 0:
                    # nearest matrix 0
                    # add it in the quue
                    queue.append((i, j, 0))
                    vis[i][j] = 1

        directions = [[0, -1], [0, 1], [1, 0], [-1, 0]]

        while queue:
            row, col, dist = queue.popleft()
            dis[row][col] = dist
            for r, c in directions:
                nr = r + row
                nc = c + col

                if (
                    nr >= 0
                    and nr < n
                    and nc >= 0
                    and nc < m
                    and mat[nr][nc] == 1
                    and not vis[nr][nc]
                ):
                    vis[nr][nc] = 1
                    queue.append((nr, nc, dist + 1))
                    dis[nr][nc] = dist + 1

        return dis
