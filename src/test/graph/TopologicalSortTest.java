package test.graph;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import main.graph.Graph;
import main.graph.TopologicalSort;

import org.junit.jupiter.api.Test;


public class TopologicalSortTest {
    @Test
    void simpleTest() {

        Graph g = new Graph(6); 
        g.addEdge(5, 2); 
        g.addEdge(5, 0); 
        g.addEdge(4, 0); 
        g.addEdge(4, 1); 
        g.addEdge(2, 3); 
        g.addEdge(3, 1); 

        List<Integer> check = Arrays.asList(5, 4, 2, 3, 1, 0);
        assertEquals(check, TopologicalSort.topologicalSort(g));
    }
}
