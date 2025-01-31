class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        list =[]
        self.findComb(0,target,candidates,list,[])
        return list

    def findComb(self,idx,targett,arr,listt,dss):
        if(targett==0):
            listt.append(dss.copy())
            return
        if idx == len(arr):  # If index reaches the end, return
            return

        if(arr[idx]<=targett):
            dss.append(arr[idx])
            self.findComb(idx,targett-arr[idx],arr,listt,dss)
            dss.pop()
        self.findComb(idx+1,targett,arr,listt,dss)


        