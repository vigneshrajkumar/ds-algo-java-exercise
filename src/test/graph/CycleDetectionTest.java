package test.graph;

import static org.junit.jupiter.api.Assertions.assertEquals;

import main.graph.Graph;
import main.graph.CycleDetection;

import org.junit.jupiter.api.Test;


public class CycleDetectionTest {
    @Test
    void simpleTest() {

        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);
        assertEquals(CycleDetection.hasCycle(graph), true);
    }
}
