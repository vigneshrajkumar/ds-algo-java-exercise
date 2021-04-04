package main.graph;

public class CycleDetection {
    private static boolean walk(int curr, Graph g, boolean[] visited, boolean[] recStack) {

        if (recStack[curr])
            return true;

        if (visited[curr])
            return false;

        visited[curr] = true;
        recStack[curr] = true;

        for (int n : g.connections(curr)) {
            if (walk(n, g, visited, recStack))
                return true;
        }

        recStack[curr] = false;
        return false;
    }

    public static boolean hasCycle(Graph g) {

        boolean[] recStack = new boolean[g.size()];
        boolean[] visited = new boolean[g.size()];

        for (int ix = 0; ix < g.size(); ix++) {
            if (walk(ix, g, visited, recStack))
                return true;
        }

        return false;
    }
}
