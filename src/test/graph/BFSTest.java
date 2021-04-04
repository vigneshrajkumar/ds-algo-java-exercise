package test.graph;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import main.graph.BFS;

import org.junit.jupiter.api.Test;


public class BFSTest {
    @Test
    void simpleTest() {

        int[][] amGraph = new int[][] { { 0, 1, 1, 0 }, { 0, 0, 1, 0 }, { 1, 0, 0, 1 }, { 0, 0, 0, 1 }, };

        List<Integer> check = new ArrayList<>();
        check.add(2);
        check.add(0);
        check.add(3);
        check.add(1);
        
        assertEquals(check, BFS.traverseBFS(amGraph, 2));
    }
}
