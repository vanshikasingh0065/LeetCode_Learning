class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
    List<int[]> res = new ArrayList<>();

    // Iterate through all slots
    for(int[] slot:  intervals){
        //this means, slot is lesser than interval, like (1,3) and (4,5)
        if(slot[1]<newInterval[0]){
            res.add(slot);
        }
        // new interval is lesser than the slot (2,4) and (5, 8)
        else if(newInterval[1]<slot[0]){
            res.add(newInterval);
            newInterval = slot;
        }
        //it is an overlap of the time intervals
        else{
            newInterval[0] = Math.min(newInterval[0],slot[0]);
            newInterval[1] = Math.max(newInterval[1], slot[1]);
        }
    }
       // insert the last newInterval
        res.add(newInterval);
        
      // convert to int[][] array
      int [][] finResult = res.toArray(new int[res.size()][]);
        return finResult;

    }
}

//NOT REQUIRED
// We are implementing a Comparator class here that extends a comparator Interface
class sortifNeeded implements Comparator<int[]>{
    @Override
    public int compare(int[] arr1 , int[] arr2){
        return Integer.compare(arr1[0],arr2[0]);
    }
}