class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        if needle not in haystack:
            return -1
            
        for i in range(len(haystack)):
            #slicing here like [0:3] or [1:4] or [2:5]
            if(haystack[i:i+len(needle)] == needle):
                return i

        

        
        return -1

        