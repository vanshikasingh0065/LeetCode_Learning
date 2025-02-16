class Solution:
    def decodeString(self, s: str) -> str:
        #cretae 3 stacks
        numStack = []
        stringStack = []
        curr = ""
        k=0


        for c in s:
            if c.isdigit():
                k = (k*10)+ int(c)
                continue
                print(c)
            
            if c=='[':
                numStack.append(k)
                k=0
                stringStack.append(curr)
                curr=""
                continue
            
            if c==']':
                temp = curr
                count =numStack.pop()
                curr = stringStack.pop() + (temp*count)
                continue
            
            curr+=c
            
            

        return curr