package test.graph;

import static org.junit.jupiter.api.Assertions.assertEquals;

import main.graph.Dijkstra;


import org.junit.jupiter.api.Test;

public class DijkstraTest {
    @Test
    void simpleTest() {

        int[][] graph = new int[][] { { 0, 7, 3, 0, 0 }, { 7, 0, 1, 2, 6 }, { 3, 1, 0, 2, 0 }, { 0, 2, 2, 0, 4 },
                { 0, 6, 0, 4, 0 } };
        int[] ass = new int[] { 0, 4, 3, 5, 9 };

        int[][] res = Dijkstra.dijkstra(graph, 0);

        for (int ix = 0; ix < res.length; ix++) {
            assertEquals(res[ix][0], ass[ix]);
        }

        // System.out.println("->" + Dijkstra.tracePath(res, 4));
    }
}
