class Solution {
    public List<String> summaryRanges(int[] nums) {
        if(nums==null || nums.length==0){
            return new ArrayList<>();
        }
        
        List<String> range = new ArrayList();
        int start = nums[0];
        
        for(int i=1; i<nums.length; i++){
            //this means its not consectuve
            if(nums[i] != nums[i-1]+1){
                if(start == nums[i-1]){
                    range.add(Integer.toString(start));
                }else{
                    range.add(start + "->" + nums[i-1]);
                }
                start = nums[i];
            }
           
        }
        
        
       if(start == nums[nums.length-1]){
           range.add(Integer.toString(start)); 
       } else{
            range.add(start + "->" + nums[nums.length-1]);
       }
        
        
        
        
        
        return range;
    }
}