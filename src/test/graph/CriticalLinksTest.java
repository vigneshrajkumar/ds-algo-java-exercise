package test.graph;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import main.graph.CriticalLinks;

import org.junit.jupiter.api.Test;


public class CriticalLinksTest {
    @Test
    void simpleTest() {

        int[][] edgeList = new int[][] { { 0, 1 }, { 1, 2 }, { 2, 0 }, { 1, 3 }, { 3, 4 }, { 4, 5 }, { 5, 3 } };
        int nodes = 6;

        List<List<Integer>> ass = Arrays.asList(Arrays.asList(1, 3));
        
        assertEquals(CriticalLinks.criticalConnections(nodes, edgeList), ass);
    }
}
