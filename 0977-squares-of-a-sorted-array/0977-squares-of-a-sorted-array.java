class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int k = nums[i]*nums[i];
            nums[i]=k;
        }
        
        Arrays.sort(nums);
        return nums;
    }
}