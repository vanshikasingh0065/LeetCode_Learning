class Solution:
    def solve(self, board: List[List[str]]) -> None:
        """
        Do not return anything, modify board in-place instead.
        """

        #we create a indentical visisted and identical Result matrix
        n = len(board)
        m = len(board[0])

        vis = [[0]*m for _ in range(n)]

        #traverse in first row and last row
        for i in range(m):
            if(board[0][i]=='O' and not vis[0][i]):
                #then we mark it visisted
                #call dfs
                self.dfs(0,i,vis,board)
            
            if(board[n-1][i]=='O' and not vis[n-1][i]):
                
                #call dfs
                self.dfs(n-1,i,vis,board)
        
        for j in range(n):
            if(board[j][0]=='O' and not vis[j][0]):
                self.dfs(j,0,vis,board)

            if(board[j][m-1]=='O' and not vis[j][m-1]):
                self.dfs(j,m-1,vis,board)

        for i in range(n):
            for j in range(m):
                if(board[i][j]=='O' and not vis[i][j]):
                    board[i][j]='X'

        return board

    def dfs(self,row,col,vis,mat):
        vis[row][col]=1
        n = len(mat)
        m = len(mat[0])

        directions=[(0,-1),(0,1),(1,0),(-1,0)]

        for r,c in directions:
            nr = row+r
            nc = col+c

            if(nr>=0 and nc>=0 and nr <n and nc<m and not vis[nr][nc] and mat[nr][nc]=='O'):
                self.dfs(nr,nc,vis,mat)

    


            
        