class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int max=1;
        int count=0;
        int sum=0;
        int keys =0;
        for(int i: nums){
            if(map.containsKey(i)){
                int k = map.get(i);
                map.replace(i, k+1);
                max = Math.max(max,k+1); 
            }else{
                map.put(i,1);
            }
        }
     //   1,1,1,7,7,7,9,9,9,9,8,8,8,8
        // for(Map.Entry<Integer,Integer> m: map.entrySet()){
        //   max = Math.max(max,m.getValue());
        // }
        for(Map.Entry<Integer,Integer> p: map.entrySet()){
          if(p.getValue()==max){
              count++;
          }
        }
        sum= count*max;
      return sum;  
    }
    
}