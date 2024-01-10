class Solution {
    public int minimumOperations(int[] nums) {
        //  here since we are identifying the duplicates
        //therefore, set is the most plausable possibilty
        Set<Integer> set = new HashSet<>();
        int res=0;
        for(int a :nums){
            if(a>0){
                set.add(a);
            }
        }
        return set.size();
    
    //     Arrays.sort(nums);
    //     //subtract the minimum from the array
    //     int count =0;
    //     int min = 0;
    //     for(int i=0; i< nums.length; i++){
    //         min = Math.min(min,nums[i]);
    //         if(nums[i]==0){
    //             continue;
    //         }else{
    //             nums[i] = nums[i]-min;
    //         }
    //         count++;
    //     }
        
    //   return count;  
    }
}