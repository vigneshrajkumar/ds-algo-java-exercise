package test.dp;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import main.dp.AllConstructTab;

public class AllConstructTabTest {
    
    @Test
    void test1(){
        String[][] ass = new String[][]{{"abc", "def"}};
        String[][] res = AllConstructTab.run("abcdef", new String[]{"ab", "abc", "cd", "def", "abcd"});
        assertArrayEquals(ass, res);
    }

    @Test
    void test2(){
        String[][] ass = null;
        String[][] res = AllConstructTab.run("skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"});
        assertArrayEquals(ass, res);
    }

    @Test
    void test3(){
        String[][] ass = new String[][]{{"purp", "le"}, {"p", "ur", "p", "le"}};;
        String[][] res = AllConstructTab.run("purple", new String[]{"purp", "p", "ur", "le", "purpl"});
        assertArrayEquals(ass, res);
    }

    @Test
    void test4(){
        String[][] ass = null;
        String[][] res = AllConstructTab.run("eeeeeeeeeeeeeef", new String[]{"e", "ee", "eee", "eeee", "eeeee"});
        assertArrayEquals(ass, res);
    }
}
