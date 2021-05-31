package main.trie;

import java.util.Map;

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        Map<Character, TrieNode> children = root.children();

        for (int ix = 0; ix < word.length(); ix++) {
            char ch = word.charAt(ix);

            TrieNode node;
            if (children.containsKey(ch)) {
                node = children.get(ch);
            } else {
                node = new TrieNode(ch);
                children.put(ch, node);
            }
            children = node.children();
            if (ix == word.length() -1){
                node.setLeaf(true);
            }
        }
    }

    public boolean search(String word) {
        Map<Character, TrieNode> children = root.children();

        TrieNode node = null;
        for(int ix = 0; ix < word.length(); ix++){
            char ch = word.charAt(ix);
            if (children.containsKey(ch)){
                node = children.get(ch);
                children = node.children();
            }else{
                node = null;
                break;
            }
        }
    
        return (node != null && node.isLeaf() ? true : false);
    }
}
