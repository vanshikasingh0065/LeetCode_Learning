import java.util.Map.*;

class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        int evenCount = 0;
        int ans=0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i : nums) {
            if (i % 2 == 0) {
                evenCount++;
                if (map.containsKey(i)) {
                    int k = map.get(i);
                    map.replace(i, k + 1);
                } else {
                    map.put(i, 1);
                }
            }
        }
        if (evenCount == 0) {
            return -1;
        }
        int maxValue = -1;
        //getting the max value from map
        for (Integer m : map.keySet()) {
            if (map.get(m)>maxValue) {
                maxValue=map.get(m);
                ans = m;
            }else if(map.get(m)==maxValue && ans>m){
                ans=m;
            }
        }
        return ans;
    }
}