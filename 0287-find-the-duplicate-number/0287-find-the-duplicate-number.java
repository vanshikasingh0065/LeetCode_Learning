class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int count = 0;
        Arrays.sort(nums);
        for(int i: nums){           
            if(map.containsKey(i)){                
                int k = map.get(i);
                System.out.print(k);
                map.replace(i,k+1);
                if(k+1==2){
                    return i;
                }
            }else{
                System.out.print(i);
                map.put(i,1);
            }
        }
       return 0; 
    }
}