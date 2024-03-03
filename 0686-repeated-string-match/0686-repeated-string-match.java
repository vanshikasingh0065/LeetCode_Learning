class Solution {
    public int repeatedStringMatch(String a, String b) {
            StringBuilder sb = new StringBuilder();
            int count=0;
            //This count is kept for the answer

            while(sb.length()<b.length()){
                sb.append(a);
                count++;
                
            }
           
            if(sb.toString().contains(b)){
                return count;
            }
        
            if(sb.append(a).toString().contains(b)){
                return ++count;
            }
        return -1;
    }
}