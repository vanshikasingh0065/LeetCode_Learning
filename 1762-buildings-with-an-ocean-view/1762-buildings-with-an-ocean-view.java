class Solution {
    public int[] findBuildings(int[] heights) {
        int max = 0;
        int num = 0;

        for (int i = heights.length - 1; i >= 0; i--) {
            int curr = heights[i];
            if (curr > max) {
                //putting all the heights that are not causing the issue as 1,
                // and rest all are put as 0 in the array
                heights[i] = 1;
                num++;
                max = curr;
            } else {
                heights[i] = 0;
            }
        }

        int[] ans = new int[num];
        int index = 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] == 1) {
                ans[index++] = i;
            }
        }

        return ans;

    }
}