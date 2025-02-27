class Solution:
    def getLargestOutlier(self, nums: List[int]) -> int:
        tot = sum(nums)
        n = len(nums)
        res = float('-inf') #loweset possible
        map={}
        for k in nums:
            map[k]= map.get(k,0)+1
        
        for num in nums:
            out = tot-num-num
            if map.get(out, 0) > (1 if out == num else 0):
                res = max(res,out)
        
        return res




            
            