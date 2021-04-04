package test.dp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.dp.CanSumTab;

public class CanSumTabTest {
    
    @Test
    void test1() {        
        assertEquals(CanSumTab.run(7, new Integer[]{2, 3}), true);
    }

    @Test
    void test2() {        
        assertEquals(CanSumTab.run(7, new Integer[]{5, 3, 4, 7}), true);
    }

    @Test
    void test3() {        
        assertEquals(CanSumTab.run(7, new Integer[]{2, 4}), false);
    }

    @Test
    void test4() {        
        assertEquals(CanSumTab.run(8, new Integer[]{2, 3, 5}), true);
    }

    @Test
    void test5() {        
        assertEquals(CanSumTab.run(300, new Integer[]{7, 14}), false);
    }
}
