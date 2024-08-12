class Solution {
    public char repeatedCharacter(String s) {
           ArrayList<Character> lst=new ArrayList();
        Character ch=s.charAt(0);
        for(int i=0;i<s.length();i++) {
            ch=s.charAt(i);
            if(lst.contains(ch)) {
                break;
            }
            else {
                lst.add(ch);
            }
        }
        return ch;
    
    }
}