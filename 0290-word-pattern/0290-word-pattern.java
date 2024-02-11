class Solution {
    public boolean wordPattern(String pattern, String s) {
        //map the character to the string
        
        if(s.length()==0 || pattern.length()==0){
            return false;
        }
        
        Map<Character,String> map = new HashMap<Character,String>();
        
        String [] splity = s.split(" ");
        if(pattern.length()!=splity.length){
            return false;
        }
        
        for(int i=0; i<pattern.length(); i++){
            char p = pattern.charAt(i);
            String j = splity[i];
            if(map.containsKey(p)){
                String k = map.get(p);
                if(k.equals(j)){
                    continue;
                }else{
                    return false;
                }
            }else{
                if(!map.containsValue(j)){
                    map.put(p,j);
                }else{
                    return false;
                }
               
            } 
        }
        
        return true;
    }
}