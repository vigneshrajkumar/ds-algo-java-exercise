package main.graph;

import java.util.ArrayList;
import java.util.List;

public class DFS {

    private static void walk(Graph g, int currentVertex, boolean[] visited, List<Integer> list){
        if (visited[currentVertex])
            return;

        visited[currentVertex] = true;

        list.add(currentVertex);

        for(Integer n : g.connections(currentVertex)){
            walk(g, n, visited, list);
        }
    }
    
    public static List<Integer> traverseDFS(Graph g, int start) {
        List<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[g.size()];

        walk(g, start, visited, res);

        return res;
    }
}
