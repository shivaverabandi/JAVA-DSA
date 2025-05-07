package TrieDataStructure;
class Node{

    Node []child = new Node[26];
    boolean isEoW = false;

    // Default constructor will be called
}
public class Trie {
    Node root;
    public Trie() {
        root = new Node();
    }

    public void insert(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i)- 'a';
            if(curr.child[idx] == null){
                curr.child[idx] = new Node();
            }
            curr = curr.child[idx];
        }
        curr.isEoW = true;
    }
    public boolean search(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i)- 'a';
            if(curr.child[idx] == null){
                return false;
            }
            curr = curr.child[idx];
        }
        return curr.isEoW;
    }
    public boolean startsWith(String prefix){
        Node curr = root;
        for(int i=0; i<prefix.length(); i++){
            int idx = prefix.charAt(i)- 'a';
            if(curr.child[idx] == null){
                return false;
            }
            curr = curr.child[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        String []words = new String[5];
        words[0] = "apple";
        words[1] = "banana";
        words[2] = "ban";
        words[3] = "apply";
        words[4] = "append";
        for(int i=0; i<words.length; i++){
            trie.insert(words[i]);
        }

        System.out.println(trie.search("apple")); // true
        System.out.println(trie.search("banana")); // true
        System.out.println(trie.startsWith("ap")); // true
        System.out.println(trie.search("appoint")); // false
        System.out.println(trie.startsWith("bu")); // false
    }
}
