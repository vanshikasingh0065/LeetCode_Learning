class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List <Integer> list = new ArrayList<Integer>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
       int  size = nums.length;
        int count =0;
        // if(size == 1){
        //     list.add(nums[0]);
        // }
        for(int i: nums){
            if(map.containsKey(i)){
               int k= map.get(i);
               System.out.print(k);
                map.replace(i,k+1);
            }else{
                map.put(i,1);
            }
        }
            
      int threshold = size/3;

      for(Map.Entry<Integer,Integer>entry : map.entrySet()){
          int key = entry.getKey();
          int value = entry.getValue();

          if(value>threshold){
              list.add(key);
          }
      }
      return list;
    }
}