class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count=0
        prefixSum=0

        map ={}
        map[0] =1
        for i in range(len(nums)):
            prefixSum = prefixSum+nums[i]
            x = prefixSum-k
            if(x in map):
                count =count+map[x]
            map[prefixSum]=map.get(prefixSum,0)+1
    
        return count
        