class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        Set<Character> set = new HashSet<>();

        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');


        for(int i=0,j=arr.length-1; i<j; ){
            //iteration is happening from both sides
            if(!set.contains(arr[i])){
                i++;
                continue;
            }
            if(!set.contains(arr[j])){
                j--;
                continue;
            }
        char temp= arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
        i++;
        j--;
    }

    return String.valueOf(arr);
}

}