class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int rem =0;
        if(n<8){
            return n;
        }else if(n<=15){
            rem = n-8;
            return 2*rem+8;
        }else if(n>=16 && n<=24){
            rem = n-16;
            return (3*rem)+(8*2)+8;
        }else{
            rem = n-24;
            return (rem*4)+(8*3)+(8*2)+8;
        }
    }
}