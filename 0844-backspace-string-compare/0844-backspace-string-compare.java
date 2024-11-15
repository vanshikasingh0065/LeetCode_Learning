class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1= new Stack<>();
        Stack<Character> stack2=new Stack<>();
        
        for(char c: s.toCharArray()){
            if(!stack1.isEmpty() && c=='#'){
                 System.out.println(stack1.peek());
                stack1.pop();
                
            }else{
                if(c!='#')
                stack1.push(c);
              //  System.out.println(stack1.peek());
            }
        }
        
        for(char d: t.toCharArray()){
            if(!stack2.isEmpty() && d=='#'){
                // System.out.println(stack1.peek());
                stack2.pop();
                
            }else{
                if(d!='#')
                stack2.push(d);
            }
        }
        
        
       return stack1.equals(stack2);
    }
}