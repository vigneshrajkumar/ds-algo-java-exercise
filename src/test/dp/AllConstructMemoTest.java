package test.dp;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import main.dp.AllConstructMemo;

public class AllConstructMemoTest {
    
    @Test
    void test1(){
        String[][] ass = new String[][]{{"def", "abc"}};
        String[][] res = AllConstructMemo.run("abcdef", new String[]{"ab", "abc", "cd", "def", "abcd"});
        for (String[] s : res) {
            System.out.println(Arrays.toString(s));
        }
        assertArrayEquals(ass, res);
    }

    @Test
    void test2(){
        String[][] ass = new String[][]{};
        String[][] res = AllConstructMemo.run("skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"});
        for (String[] s : res) {
            System.out.println(Arrays.toString(s));
        }
        assertArrayEquals(ass, res);
    }

    @Test
    void test3(){
        String[][] ass = new String[][]{{"le", "purp"}, {"le", "p", "ur", "p"}};;
        String[][] res = AllConstructMemo.run("purple", new String[]{"purp", "p", "ur", "le", "purpl"});
        for (String[] s : res) {
            System.out.println(Arrays.toString(s));
        }
        assertArrayEquals(ass, res);
    }

    @Test
    void test4(){
        String[][] ass = new String[][]{};
        String[][] res = AllConstructMemo.run("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[]{"e", "ee", "eee", "eeee", "eeeee"});
        for (String[] s : res) {
            System.out.println(Arrays.toString(s));
        }
        assertArrayEquals(ass, res);
    }
}
