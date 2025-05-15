class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        #the longest coversion would be LENGTH - MAX FREQUENCT
        #For Example, AAA has appeared 3 tims and AABCAB
        #so we conver BC
        left =0
        right =0

        maxlen =0
        maxfreq =0
        nmap = defaultdict(int)
        n = len(s)

        for right in range(n):
            nmap[s[right]]+=1

            maxfreq = max(maxfreq,nmap[s[right]])

            #checking if the window is valid

            if (right-left+1)- maxfreq >k:
                nmap[s[left]]-=1
                if nmap[s[left]]==0:
                    del nmap[s[left]]
                
                maxfreq =0
                left+=1

            if (right-left+1)- maxfreq <= k:
                maxlen = max(maxlen, right-left+1)
            
        return maxlen




            

        