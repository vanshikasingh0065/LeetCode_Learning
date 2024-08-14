class Solution {
    public int findFinalValue(int[] nums, int original) {
       Set<Integer> integers = new HashSet<>();
        for(int i:nums){
            integers.add(i);
        }
        while(integers.contains(original)){
            original=original*2;
        }
        return original;
    }
}