package test.grid;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

import main.grid.UniqueIslands;

public class UniqueIslandsTest {
    
    @Test
    void simpleTest() {

        int[][] map = new int[][] { { 1, 1, 0, 0, 0 }, { 1, 1, 0, 0, 0}, { 0, 0, 0, 1, 1 }, { 0, 0, 0, 1, 1 }};

        assertEquals(1, UniqueIslands.numDistinctIslands(map));
    }
}
