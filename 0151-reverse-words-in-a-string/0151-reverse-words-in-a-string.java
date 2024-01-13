class Solution {
    public String reverseWords(String s) {

        StringBuilder sb = new StringBuilder();

        String[] sarr = s.split(" ");
        for (int i = sarr.length - 1; i >= 0; i--) {
            sb.append(sarr[i]);
            if(i!=0){
                 sb.append(" ");
            }
        }
           
            String k = sb.toString();
            String nnew = k.trim().replaceAll(" +"," ");
      

        return nnew;

        // StringBuilder sc = new StringBuilder();

        // String[] arr = s.split(" ");

        // for (int i = arr.length - 1; i >= 0; i--) {
        //     System.out.println(arr[i]);
        //     sc.append(arr[i]);
        //     if (i != 0) {
        //         sc.append(" ");
        //     }
        // }
        // String k = sc.toString();
        // String after = k.trim().replaceAll(" +", " ");
        // return after;

    }
}