class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer,Integer> checkMap = new HashMap<Integer,Integer>();
        Map<Integer,Integer> countMap = new HashMap<Integer,Integer>();
        int count=0;

        for(int i: arr){
            if(checkMap.containsKey(i)){
                int k = checkMap.get(i);
                checkMap.put(i, k+1);
            }else{
                checkMap.put(i,1);
            }
        }

        for(Map.Entry<Integer,Integer> pop :checkMap.entrySet()){
            System.out.println(pop.getValue());
            if(countMap.containsKey(pop.getValue())){
                return false;
            }else{
                countMap.put(pop.getValue(),1);
            }
            
        }
        return true;
    }
}