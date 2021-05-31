package test.trie;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import main.trie.Trie;


public class TrieTest {
    @Test
    void simpleTest() {
        Trie trie = new Trie();
        trie.insert("vignesh");
        trie.insert("sai");
        trie.insert("baradhan");
        
        assertEquals(trie.search("vignesh"), true);
        assertEquals(trie.search("sai"), true);
        assertEquals(trie.search("baradhan"), true);
        assertEquals(trie.search("suresh"), false);
        assertEquals(trie.search("sakthi"), false);
    }
}
