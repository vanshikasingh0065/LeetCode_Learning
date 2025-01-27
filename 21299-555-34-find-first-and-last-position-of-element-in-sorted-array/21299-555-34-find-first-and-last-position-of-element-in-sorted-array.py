class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        if len(nums)==0:
            return [-1,-1]
        my_list = [-1] * 2
        count=0
        start, end = -1, -1
        for i in range(len(nums)):
            if(nums[i]==target):
                if start == -1:  # First occurrence of the target
                    start = i
                end = i
        my_list = [start,end]
        return my_list
        
        