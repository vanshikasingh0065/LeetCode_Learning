class Solution {
    public boolean isPerfectSquare(int x) {
        if(x==0 || x==1){
            return true;
        }
        double i =1;
        while(i<= x/i){
            i++;
            if( (x/i) == i){
                return true;
            } 
        }
        return false;
    }
}