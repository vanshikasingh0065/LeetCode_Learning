class Solution:
    def search(self, nums: List[int], target: int) -> int:
        #binary search

        right = len(nums)-1
        left = 0


        while(left<=right):

            mid = (left+right)//2

            print(mid)
            if nums[mid]==target:
                return mid
            elif(nums[mid]>=nums[left]):
                if nums[left]<=target<nums[mid]:
                    right=mid-1
                else:
                   left = mid+1
            else:
                if nums[right]>=target>nums[mid]:
                    left= mid+1
                else:
                    right = mid-1  


        return -1 
        