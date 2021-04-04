package main.graph;

import java.util.ArrayList;
import java.util.List;

public class ConnectedComponents {
    private static void walk(int currNode, Graph g, boolean[] visited, List<Integer> trail){
        
        if (visited[currNode])
            return;
        
        visited[currNode] = true;

        trail.add(currNode);

        for(int n : g.connections(currNode)){
            walk(n, g, visited, trail);
        }
    }

    public static List<List<Integer>> getConnectedComps(Graph g){
        List<List<Integer>> list = new ArrayList<>();
        boolean[] visited = new boolean[g.size()];

        for(int ix = 0; ix < g.size(); ix++){
            if (!visited[ix]){
                List<Integer> trail = new ArrayList<>() ;
                walk(ix, g, visited, trail);
                list.add(trail);
            }
        }
        return list;
    }
}
