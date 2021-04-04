package test.dp;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import main.dp.BestSumTab;

public class BestSumTabTest {

    @Test
    void test1(){
        assertArrayEquals(new Integer[]{7}, BestSumTab.run(7, new Integer[]{5, 3, 4, 7}));
    }

    @Test
    void test2(){
        assertArrayEquals(new Integer[]{3, 5}, BestSumTab.run(8, new Integer[]{2, 3, 5}));
    }

    @Test
    void test3(){
        assertArrayEquals(new Integer[]{4, 4}, BestSumTab.run(8, new Integer[]{1, 4, 5}));
    }

    @Test
    void test5(){
        assertArrayEquals(new Integer[]{25, 25, 25, 25}, BestSumTab.run(100, new Integer[]{1, 2, 5, 25}));
    }
    
}
