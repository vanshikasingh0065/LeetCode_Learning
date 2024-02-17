class Solution {
    public int furthestDistanceFromOrigin(String moves) {

        int count = 0;
        int d = 0;
        char[] chars = moves.toCharArray();
        for (char p : chars) {

            if (p == 'L') {
                count--;
            } else if (p == 'R') {
                count++;
            } else if (p == '_') {
                d++;
            }
        }

        return Math.abs(count) + d;
    }
}