public class TrieMethods {
    static class Node{
        Node []children;
        boolean eow;
        public Node(){
            children = new Node[26];
            for(int i=0; i<26; i++){
                children[i] = null;
            }
            eow = false;
        }
    }
    public static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        int idx = 0;
        for(int i=0; i<word.length(); i++){
           idx = word.charAt(i) - 'a';
           if (curr.children[idx] == null) {
            curr.children[idx] = new Node();
           }
           curr = curr.children[idx];
        }
        curr.eow = true;

    }
    public static boolean search(String key){
        Node curr = root;
        for(int i=0; i<key.length(); i++){
            int idx = key.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;

    }
    public static void main(String[] args) {
        String [] words = {"this", "is", "a", "trie", "for", "storing", "data"};
        for(int i=0; i<words.length; i++){
            insert(words[i]);
            System.out.println("Inserted " + words[i]);
        }
        System.out.println(search("thor"));
        System.out.println(search("dat"));
        System.out.println(search("trie"));
    }
}
