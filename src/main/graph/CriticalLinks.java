package main.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CriticalLinks {

    private static int[][] constructGraph(int n,  int[][] edgeList) {
        int[][] graph = new int[n][n];
        for (int[] e : edgeList) {
            graph[e[0]][e[1]] = 1;
            graph[e[1]][e[0]] = 1;
        }
        return graph;
    }
    
    private static List<Integer> connections(int curr, int[][] graph) {
        List<Integer> cons = new ArrayList<>();
        for (int ix = 0; ix < graph.length; ix++) {
            if (graph[curr][ix] == 1)
                cons.add(ix);
        }
        return cons;
    }

    private static void walk(int curr, int[][] graph, boolean[] visited, List<Integer> list) {
        if (visited[curr])
            return;
        visited[curr] = true;
        list.add(curr);
        for (int n : connections(curr, graph))
            walk(n, graph, visited, list);
    }

    private static int componentCount(int[][] graph) {
        boolean[] visited = new boolean[graph.length];
        List<List<Integer>> list = new ArrayList<>();
        for (int ix = 0; ix < graph.length; ix++)
            if (!visited[ix]) {
                List<Integer> innerList = new ArrayList<>();
                walk(ix, graph, visited, innerList);
                list.add(innerList);
            }
        return list.size();
    }
   
    private static int[] next(int[] edge, int size) {
        if (edge[1] == size - 1) {
            edge[1] = 0;
            edge[0]++;
        } else {
            edge[1]++;
        }
        return edge;
    }

    private static void addEdge(int[] edge, int[][] graph) {
        graph[edge[0]][edge[1]] = 1;
    }

    private static void removeEdge(int[] edge, int[][] graph) {
        graph[edge[0]][edge[1]] = 0;
    }
    
    public static List<List<Integer>> criticalConnections(int n, int[][] connections) {
        
        List<List<Integer>> ciriticalEdges = new ArrayList<>(n);
        int[][] graph = constructGraph(n, connections);
        
        int[] lastEdge = new int[] { graph.length - 1, graph.length - 1 };
        
        for (int[] edge = new int[] { 0, 0 }; !Arrays.equals(edge, lastEdge); next(edge, graph.length)) {    
            if (graph[edge[0]][edge[1]] == 0)
                continue;
            removeEdge(edge, graph);
            if (componentCount(graph) > 1) {
                List<Integer> newEdge = new ArrayList<>();
                newEdge.add(edge[0]);
                newEdge.add(edge[1]);
                ciriticalEdges.add(newEdge);
            }
            addEdge(edge, graph);
        }
                
        return ciriticalEdges;
    }

}
