package test.graph;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import main.graph.PrimMST;

import org.junit.jupiter.api.Test;


public class PrimMSTTest {
    @Test
    void simpleTest() {

        int graph[][] = new int[][] { { 0, 5, 0, 4 }, { 5, 0, 3, 2 }, { 0, 3, 0, 6 }, { 4, 2, 6, 0 } };

        List<List<Integer>> res = PrimMST.primMST(graph);
        List<List<Integer>> ass = Arrays.asList(Arrays.asList(0, 3), Arrays.asList(3, 1), Arrays.asList(1, 2));
        assertEquals(ass, res);
    }
}
