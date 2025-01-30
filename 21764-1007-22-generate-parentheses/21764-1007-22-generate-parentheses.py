class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        list =[]
        self.solve(n,n,"",list)
        return list
    

    def solve(self,opened,closed,op,list):
            if(opened==0 and closed==0):
                list.append(op)
                return
            if(opened>0):
                op1=op
                op1+="("
                self.solve(opened-1,closed,op1,list)
            if(closed>opened):
                op2=op
                op2+=")"
                self.solve(opened,closed-1,op2,list)


