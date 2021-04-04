package test.dp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.dp.CanSumMemo;

public class CanSumMemoTest {
    
    @Test
    void test1() {        
        assertEquals(CanSumMemo.run(7, new Integer[]{2, 3}), true);
    }

    @Test
    void test2() {        
        assertEquals(CanSumMemo.run(7, new Integer[]{5, 3, 4, 7}), true);
    }

    @Test
    void test3() {        
        assertEquals(CanSumMemo.run(7, new Integer[]{2, 4}), false);
    }

    @Test
    void test4() {        
        assertEquals(CanSumMemo.run(8, new Integer[]{2, 3, 5}), true);
    }

    @Test
    void test5() {        
        assertEquals(CanSumMemo.run(300, new Integer[]{7, 14}), false);
    }
}
