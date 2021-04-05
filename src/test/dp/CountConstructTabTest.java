package test.dp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.dp.CountConstructTab;

public class CountConstructTabTest {
    
    @Test
    void test1(){
        assertEquals(1, CountConstructTab.run("abcdef", new String[]{"ab", "abc", "cd", "def", "abcd"}));
    }

    @Test
    void test2(){
        assertEquals(0, CountConstructTab.run("skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"}));
    }

    @Test
    void test3(){
        assertEquals(4, CountConstructTab.run("enterapotentpot", new String[]{"a", "p", "ent", "enter", "ot", "o", "t"}));
    }

    @Test
    void test4(){
        assertEquals(0, CountConstructTab.run("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[]{"e", "ee", "eee", "eeee", "eeeee"}));
    }

    @Test
    void test5(){
        assertEquals(2, CountConstructTab.run("purple", new String[]{"purp", "p", "ur", "le", "purpl"}));
    }
    
}
