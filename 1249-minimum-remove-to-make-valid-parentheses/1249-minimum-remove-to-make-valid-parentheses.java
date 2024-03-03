class Solution {
    public String minRemoveToMakeValid(String s) {
        //Initialaizing a stack
        
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder(s);
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                stack.push(i);
            }else if(s.charAt(i) ==')'){
                if(!stack.isEmpty() && s.charAt(stack.peek())=='('){
                    stack.pop();
                }else{
                    stack.push(i);
                }
            }
        }
        
        //All the other brackets that were left, were removed
         while(!stack.isEmpty()){
            sb.deleteCharAt(stack.pop());
        }
        return sb.toString();
        
    }
}