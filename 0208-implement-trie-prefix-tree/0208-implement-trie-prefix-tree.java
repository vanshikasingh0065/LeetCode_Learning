class Trie {

        public static class Node{
         Node[] children;
        Boolean check;
        
        public Node(){
            children  = new Node[26];
            check = false;
        }
    }
    
     public Trie() {
         root = new Node();
     }
        
        Node root;
    
    public void insert(String word) {
        Node node = root;
        
        for(int i=0; i<word.length(); i++){
            int val = word.charAt(i)-'a';
            if(node.children[val]==null){
               node.children[val] = new Node();
            }
            node = node.children[val];
        }
       node.check = true; 
    }
    
    public boolean search(String word) {
         Node node = root;
        
        for(int i=0; i<word.length(); i++){
            int val = word.charAt(i)-'a';
            if(node.children[val]==null){
                return false;
            }
            node = node.children[val];
        }
        if(node.check){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean startsWith(String prefix) {
        Node node = root;
        for (int i=0; i<prefix.length(); i++){
            int val = prefix.charAt(i) - 'a';
            if (node.children[val] == null)
                return false;
            node = node.children[val];
        }
        return true;
    }  
    
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */