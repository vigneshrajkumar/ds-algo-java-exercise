package test.grid;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

import main.grid.ConnectedIslands;

public class ConnectedIslandsTest {
    
    @Test
    void simpleTest() {

        int[][] map = new int[][] { { 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 1 }, { 1, 0, 0, 1, 1 }, { 0, 0, 0, 0, 0 },
                { 1, 0, 1, 1, 0 }, };

            
        assertEquals(5, ConnectedIslands.findIslands(map));
    }
}
