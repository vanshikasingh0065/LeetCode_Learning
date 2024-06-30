class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
//         List<Integer> list = new ArrayList<Integer>();
//         for(int i=0; i<nums1.length; i++){
//             if(i==0 || nums1[i]!=nums1[i-1]){
//                 for(int k: nums2){
//                     if(k==nums1[i]){
//                         list.add(k);
//                     }
//                 }
//             }
//         }
//         Integer[] arr = new Integer[list.size()];
//        // list.toArray();
//         return list.stream().mapToInt(Integer::intValue).toArray();
        
        
        Set<Integer> set1 = new HashSet<>();
        for(int i: nums1){
            set1.add(i);
        }
        Set<Integer> set2 = new HashSet<>();
        for(int j: nums2){
            if(set1.contains(j)){
                set2.add(j);
            }
        }
        
        //now we just have to convert the set to an array
        
        int[] arr = new int[set2.size()];
            int k=0;
        for(int x: set2){
            arr[k]=x;
            k++;
        }
    return arr;
    }
}