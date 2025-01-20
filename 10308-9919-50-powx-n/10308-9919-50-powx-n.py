class Solution:
    def myPow(self, x: float, n: int) -> float:

        ans =1.0
        if(n < 0):
            x = 1/x
            n = -(n+1)
            ans = ans * x
        
        while(n>0):
            if(n%2==0):
                #when power is even 
                #we make it 4^512
                n=n/2
                x=x*x
            else:
                #we multiple the ans with one, that istake out 2^1 and make the entire thing even
                n=n-1
                ans = ans*x
            
        
    
        return ans
        