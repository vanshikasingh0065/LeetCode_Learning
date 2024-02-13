class Solution {
    public boolean isAnagram(String s, String t) {
        //we store everything in a map for one of the word, and check the nect worrdif it has the same 
        
        if(s.length()!=t.length()){
            return false;
        }
        
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0; i<s.length(); i++){
            char k = s.charAt(i);
            if(map.containsKey(k)){
            int m = map.get(k);
              map.replace(k,m+1); 
            }else{
                map.put(k,1);
            }
        }
        
        for(int i=0; i<t.length(); i++){
            char u = t.charAt(i);
            if(map.containsKey(u)){
            int m = map.get(u);
                if(m==0){
                    return false;
                }
             map.replace(u,m-1); 
            }else{
               return false;
            }
        } 

        
        return true;
        
        
    }
}