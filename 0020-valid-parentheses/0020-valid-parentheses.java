class Solution {
    public boolean isValid(String s) {
        Boolean check = Boolean.TRUE;
        Stack<Character> stack = new Stack<Character>();
        
      for(int i=0; i<s.length(); i++){
          char p = s.charAt(i);
          
          if(p=='(' || p=='{' || p== '['){
              stack.push(p);
          }else if(stack.isEmpty()){
               return false;
          }else if(p==')'  && stack.pop()!='('){
              return false;
          }else if(p=='}'  && stack.pop()!='{'){
                return false;
          }else if(p==']'  && stack.pop()!='['){
                 return false;
          }
      }
        
        return stack.isEmpty();
    }
}