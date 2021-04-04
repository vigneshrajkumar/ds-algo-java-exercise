package test.dp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.dp.CountConstructMemo;

public class CountConstructMemoTest {
    
    @Test
    void test1(){
        assertEquals(1, CountConstructMemo.run("abcdef", new String[]{"ab", "abc", "cd", "def", "abcd"}));
    }

    @Test
    void test2(){
        assertEquals(0, CountConstructMemo.run("skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"}));
    }

    @Test
    void test3(){
        assertEquals(4, CountConstructMemo.run("enterapotentpot", new String[]{"a", "p", "ent", "enter", "ot", "o", "t"}));
    }

    @Test
    void test4(){
        assertEquals(0, CountConstructMemo.run("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[]{"e", "ee", "eee", "eeee", "eeeee"}));
    }

    @Test
    void test5(){
        assertEquals(2, CountConstructMemo.run("purple", new String[]{"purp", "p", "ur", "le", "purpl"}));
    }
    
}
