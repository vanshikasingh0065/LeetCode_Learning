class Solution:
    def hammingDistance(self, x: int, y: int) -> int:
        count=0
        #we did the XOR here, where 
        #0 0 0 1
        # 0 1 0 0 
        # xor = 0 1 0 1
        # 1, 0 =1 and 00 =0 and 11=0 

        temp = x^y
        while temp!=0:
            if temp&1 ==1:
                count+=1
            temp = temp>>1
        return count


            

        