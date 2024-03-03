class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
        int length = s.length();
        
        for(int i=1; i<length; i++){
          //  n%i==0 means it is divisible and hence is repeating 
            if(length%i==0 && s.startsWith(s.substring(i))){
                return true;
            }
        }
        return false;
    }
}