class Solution {
    public int getLargestOutlier(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int total =0;
        int res = Integer.MIN_VALUE;
        for(int a: nums){
            total+=a;
            map.put(a,map.getOrDefault(a,0)+1);
        }

       for(int a:nums){
        int out = total -a-a;
        if(map.getOrDefault(out,0) > (out == a ? 1:0)){
            res = Math.max(res,out);
        }
       }
       return res;
    }
}