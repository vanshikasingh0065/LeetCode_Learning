class Solution {
    public int majorityElement(int[] nums) {
        
        int count = 0;
        int size = nums.length;
        System.out.println(size);
        if(size == 1){
            return nums[0];
        }
        if(size == 0){
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i : nums) {
            if (map.containsKey(i)) {
                int k = map.get(i);
                System.out.println(k);
                if (k+1 > size / 2) {
                    count = i;
                    break;
                }
                map.replace(i, k + 1);
            } else {
                map.put(i, 1);
            }
        }
        return count;
    }
}