package test.dp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.dp.CanConstructTab;

public class CanConstructTabTest {
    
    @Test
    void test1(){
        assertEquals(true, CanConstructTab.run("abcdef", new String[]{"ab", "abc", "cd", "def", "abcd"}));
    }

    @Test
    void test2(){
        assertEquals(false, CanConstructTab.run("skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"}));
    }

    @Test
    void test3(){
        assertEquals(true, CanConstructTab.run("enterapotentpot", new String[]{"a", "p", "ent", "enter", "ot", "o", "t"}));
    }

    @Test
    void test4(){
        assertEquals(false, CanConstructTab.run("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[]{"e", "ee", "eee", "eeee", "eeeee"}));
    }
    
}
