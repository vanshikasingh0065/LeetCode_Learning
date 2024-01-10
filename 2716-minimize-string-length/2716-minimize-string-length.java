class Solution {
    public int minimizedStringLength(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
              int p =  map.get(s.charAt(i));
              map.replace(s.charAt(i),p+1);
            }else{
                map.put(s.charAt(i),1);
            } 
        }
        return map.size();
    }

   // return s.chars().distinct().count();
}