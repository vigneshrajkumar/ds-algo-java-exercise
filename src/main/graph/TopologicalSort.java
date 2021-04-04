package main.graph;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TopologicalSort {

    private static Deque<Integer> stack = null;
    private static boolean[] visited = null;

    private static void walk(Graph g, int currNode) {

        if (visited[currNode])
            return;
        
        visited[currNode] = true;
        
        for(int n : g.connections(currNode))
            walk(g, n);
        
        stack.push(currNode);
    }

    public static List<Integer> topologicalSort(Graph g) {

        List<Integer> res = new ArrayList<>();
        stack = new ArrayDeque<>();
        visited = new boolean[g.size()];

        for (int i = 0; i < g.size(); i++) {
            walk(g, i);
        }

        while(!stack.isEmpty()){
            res.add(stack.poll());
        }
        return res;
    }
}
