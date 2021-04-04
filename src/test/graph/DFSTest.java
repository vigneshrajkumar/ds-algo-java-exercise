package test.graph;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import main.graph.DFS;
import main.graph.Graph;

import org.junit.jupiter.api.Test;


public class DFSTest {
    @Test
    void simpleTest() {

        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        List<Integer> ass = Arrays.asList(2, 0, 1, 3);
        
        assertEquals(ass, DFS.traverseDFS(g, 2));
    }
}
