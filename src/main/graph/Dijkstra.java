package main.graph;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Dijkstra {

    private static int getNextNode(int[][] table, boolean[] visited) {
		int min = Integer.MAX_VALUE;
		int minIx = -1;
		for (int ix = 0; ix < table.length; ix++) {
			if (!visited[ix] && table[ix][0] <= min) {
				min = table[ix][0];
				minIx = ix;
			}
		}
		return minIx;
	}

	public static int[][] dijkstra(int graph[][], int src) {
		int table[][] = new int[graph.length][2];
		boolean visited[] = new boolean[graph.length];

		for (int i = 0; i < graph.length; i++) {
			table[i][0] = Integer.MAX_VALUE;
			table[i][1] = -1;
		}
		table[src][0] = 0;

		for (int ix = 0; ix < graph.length - 1; ix++) {
			int nextNode = getNextNode(table, visited);
			visited[nextNode] = true;
			for (int jx = 0; jx < graph.length; jx++) {
				if (!visited[jx] && graph[nextNode][jx] != 0 && table[nextNode][0] != Integer.MAX_VALUE
						&& table[nextNode][0] + graph[nextNode][jx] < table[jx][0]) {
					table[jx][0] = table[nextNode][0] + graph[nextNode][jx];
					table[jx][1] = nextNode;
				}
			}
		}
		return table;
	}

	public static List<Integer> tracePath(int[][] table, int dest){
		List<Integer> path = new ArrayList<>();
		Deque<Integer> stack = new ArrayDeque<>();
		while(dest != 0){
			stack.push(table[dest][1]);
			dest = table[dest][1];
		}
		while(!stack.isEmpty())
			path.add(stack.poll());
		return path;
	}
}
