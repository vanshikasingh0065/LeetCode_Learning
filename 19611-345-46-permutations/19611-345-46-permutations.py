class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        ans =[]
        freqency=[False] * len(nums)
        self.helper(nums,freqency,[],ans)
        return ans



    def helper(self,nums,freq, ds, listt):
        if(len(ds)==len(nums)):
            listt.append(ds.copy())
        
        for i in range(len(nums)):
            if(freq[i] is False):
                freq[i]=True
                ds.append(nums[i])
                self.helper(nums,freq,ds,listt)
                ds.pop()
                freq[i]=False




        