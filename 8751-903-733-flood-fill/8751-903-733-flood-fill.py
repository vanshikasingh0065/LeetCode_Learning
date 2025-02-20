class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:
        #Get the initial color 
        ini = image[sr][sc]
        #create a replica to Populate 
        res = image
        directions = [[0,1],[0,-1],[1,0],[-1,0]]
        self.dfs(ini, directions,res,image,color,sr,sc)

        return res

    
    def dfs(self, ini, directions,res,image,color, sr,sc):
        n = len(image)
        m = len(image[0])
        res[sr][sc]= color

        #loop on all 4 directions


        for drow,dcol in directions:
            nrow = sr+drow
            ncol = sc+dcol

            if(nrow>=0 and nrow<n and ncol >=0 and ncol<m and image[nrow][ncol]==ini and not res[nrow][ncol]==color):
                self.dfs(ini, directions,res,image,color,nrow,ncol)



        