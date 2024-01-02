class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        // We have to find out all the subarrays and then check their sum
        int presum=0;
        int count =0;
        if(nums.length <= 1)
            return false;
        
        map.put(0, -1);

        for(int i=0; i<nums.length; i++){
         // System.out.println(presum);

           //add presum%k  in the hashmap
           int check = (presum+nums[i])%k;
           System.out.println(check);
           
           if(map.containsKey(check)){
                int last_index = map.get(check);
                if(i - last_index >= 2) {
                    return true;
                }
            }
            
            map.putIfAbsent(check, i);
            
            presum = presum + nums[i];
        }

        return false;
    }
}

//presum
/*. 1    4   3    5    6 8. /

1.  5.  8.  13.  19. 27

1.   5.   2.  1*/

//. 



