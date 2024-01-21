class Solution {
    public boolean isMajorityElement(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int length = nums.length;
        for(int i: nums){
            if(map.containsKey(i)){
                int k = map.get(i);
                if(k+1>length/2){
                    if(i==target){
                        return true;
                    }
                }
                map.replace(i,k+1);
            }else{
                map.put(i,1);
            }
        }
        return false;
    }
}