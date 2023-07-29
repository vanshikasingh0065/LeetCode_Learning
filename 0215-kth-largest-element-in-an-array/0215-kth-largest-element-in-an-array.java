class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        int max =0;
        int kMax=0;
        
        Arrays.sort(nums); 
        //1, 2, 3, 4, 5, 6
        System.out.print(nums.length-(k));
       kMax= nums[nums.length-(k)];
        return kMax;
        
    }
}