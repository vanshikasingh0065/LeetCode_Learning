class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        int chnage =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==original){
                chnage = nums[i]*2;
            }
            if(nums[i]==chnage){
                 chnage = nums[i]*2;
            }
        }
        if(chnage ==0){
            return original;
        }
        return chnage;
    }
}