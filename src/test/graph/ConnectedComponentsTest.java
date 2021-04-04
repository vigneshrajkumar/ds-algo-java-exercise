package test.graph;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import main.graph.Graph;
import main.graph.ConnectedComponents;

import org.junit.jupiter.api.Test;


public class ConnectedComponentsTest {
    @Test
    void simpleTest() {

        Graph graph = new Graph(5);
        graph.addEdge(1,0);
        graph.addEdge(0,1);
        graph.addEdge(2,3);
        graph.addEdge(3,2);
        graph.addEdge(3,4);
        graph.addEdge(4,3);

        List<List<Integer>> ass = Arrays.asList(Arrays.asList(0, 1), Arrays.asList(2, 3, 4));
        List<List<Integer>> res = ConnectedComponents.getConnectedComps(graph);
        assertEquals(ass, res);
    }
}
