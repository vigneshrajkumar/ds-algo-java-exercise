package test.dp;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import main.dp.BestSumMemo;

public class BestSumMemoTest {

    @Test
    void test1(){
        assertArrayEquals(new Integer[]{7}, BestSumMemo.run(7, new Integer[]{5, 3, 4, 7}));
    }

    @Test
    void test2(){
        assertArrayEquals(new Integer[]{5, 3}, BestSumMemo.run(8, new Integer[]{2, 3, 5}));
    }

    @Test
    void test3(){
        assertArrayEquals(new Integer[]{4, 4}, BestSumMemo.run(8, new Integer[]{1, 4, 5}));
    }

    @Test
    void test5(){
        assertArrayEquals(new Integer[]{25, 25, 25, 25}, BestSumMemo.run(100, new Integer[]{1, 2, 5, 25}));
    }
    
}
