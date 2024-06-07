class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        char[] p =  stones.toCharArray();
        int count =0;
      //  Map<Character, Integer> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for(int i=0; i<jewels.length(); i++){
                set.add(jewels.charAt(i));
            }
    
        for(int i=0; i<p.length; i++){
               if(set.contains(p[i])){
                   count++;
               }
            }
        return count;
    }
}