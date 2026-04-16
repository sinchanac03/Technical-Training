package DataStructures.Trie;

class Node{
    Node[] children;
    boolean isEnd;

    Node(){
        children = new Node[26];
        isEnd = false;
    }
}

public class Trie {
    Node root;
    Trie(){
        root = new Node();
    }

    // INSERT word
    void insert(String word){
        Node curr = root;

        for(char ch : word.toCharArray()){
            int index = ch - 'a';
            if(curr.children[index] == null){
                curr.children[index] = new Node();
            }

            curr = curr.children[index];
        }
        curr.isEnd = true;
    }

    boolean search(String word){
        Node curr = root;
        for(char ch : word.toCharArray()){
            int index = ch-'a';
            if(curr.children[index] == null){
                return false;
            }
            curr = curr.children[index];
        }

        return curr.isEnd;
    }

    // prefix search
    boolean prefixSearch(String prefix){
        Node curr = root;
        for(char ch : prefix.toCharArray()){
            int index = ch - 'a';
            if(curr.children[index] == null){
                return false;
            }
            curr = curr.children[index];
        }
        return true;
    }
}



class Driver{
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("cat");
        trie.insert("car");

        System.out.println(trie.search("cat"));
        System.out.println(trie.search("car"));
        System.out.println(trie.prefixSearch("ca"));
    }
}