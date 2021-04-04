package main.graph;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BFS {

    private static List<Integer> getConnections(int[][] g, int node) {
        List<Integer> cons = new ArrayList<>();
        for (int ix = 0; ix < g.length; ix++)
            if (g[node][ix] != 0)
                cons.add(ix);
        return cons;
    }

    public static List<Integer> traverseBFS(int[][] g, int start) {
        boolean[] visited = new boolean[g.length];
        List<Integer> res = new ArrayList<>();
        Deque<Integer> queue = new ArrayDeque<>();

        queue.add(start);

        while (!queue.isEmpty()) {
            int curr = queue.poll();

            if (visited[curr])
                continue;

            res.add(curr);

            visited[curr] = true;

            List<Integer> cons = getConnections(g, curr);
            for (int n : cons)
                queue.add(n);
        }
        return res;
    }
}
