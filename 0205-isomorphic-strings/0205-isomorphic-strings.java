class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<Character,Character>();
        if(s.length()==0 || t.length()==0 || s.length()!=t.length()){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            char p = s.charAt(i);
            char q = t.charAt(i);
            
            if(map.containsKey(p)){
                char k = map.get(p);
                if(k==q){
                    continue;
                }else{
                    return false;
                }
            }else{
                if(!map.containsValue(q)){
                     map.put(p,q);
                }else{
                    return false;
                }
               
            }
        }
        
       return true; 
    }
}