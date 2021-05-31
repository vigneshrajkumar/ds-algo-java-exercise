package main.trie;

import java.util.Map;
import java.util.HashMap;

public class TrieNode {
    private Character value;
    private Map<Character, TrieNode> children;
    private boolean isLeaf;

    public TrieNode(){
        this.children = new HashMap<>();
    }
    
    public TrieNode(Character c){
        this.value = c;
        this.children = new HashMap<>();
    }

    public Map<Character, TrieNode> children(){
        return this.children;
    }

    public Character value(){
        return this.value;
    }

    public boolean isLeaf(){
        return this.isLeaf;
    }

    public boolean setLeaf(boolean val){
        return this.isLeaf = val;
    }
}
