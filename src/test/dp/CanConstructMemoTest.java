package test.dp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.dp.CanConstructMemo;

public class CanConstructMemoTest {
    
    @Test
    void test1(){
        assertEquals(true, CanConstructMemo.run("abcdef", new String[]{"ab", "abc", "cd", "def", "abcd"}));
    }

    @Test
    void test2(){
        assertEquals(false, CanConstructMemo.run("skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"}));
    }

    @Test
    void test3(){
        assertEquals(true, CanConstructMemo.run("enterapotentpot", new String[]{"a", "p", "ent", "enter", "ot", "o", "t"}));
    }

    @Test
    void test4(){
        assertEquals(false, CanConstructMemo.run("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[]{"e", "ee", "eee", "eeee", "eeeee"}));
    }
    
}
