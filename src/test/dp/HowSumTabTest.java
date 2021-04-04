package test.dp;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import main.dp.HowSumTab;

public class HowSumTabTest {
    
    @Test
    void test1() {        
        assertArrayEquals(new Integer[]{3, 2, 2}, HowSumTab.run(7, new Integer[]{2, 3}));
    }

    @Test
    void test2() {        
        assertArrayEquals(new Integer[]{4, 3}, HowSumTab.run(7, new Integer[]{5, 3, 4, 7}));
    }

    @Test
    void test3() {        
        assertArrayEquals(null, HowSumTab.run(7, new Integer[]{2, 4}));
    }

    @Test
    void test4() {        
        assertArrayEquals(new Integer[]{2, 2, 2, 2}, HowSumTab.run(8, new Integer[]{2, 3, 5}));
    }

    @Test
    void test5() {        
        assertArrayEquals(null, HowSumTab.run(300, new Integer[]{7, 14}));
    }
}
