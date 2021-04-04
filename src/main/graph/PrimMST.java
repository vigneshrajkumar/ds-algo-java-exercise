package main.graph;

import java.util.ArrayList;
import java.util.List;

public class PrimMST {

    public static List<List<Integer>> primMST(int graph[][]) {

        List<List<Integer>> edgeList = new ArrayList<>();
        boolean[] partOfMST = new boolean[graph.length];

        while (edgeList.size() < graph.length - 1) {
            int chosenVertU = 0;
            int chosenVertV = 0;
            int minWeight = Integer.MAX_VALUE;

            partOfMST[0] = true;

            for (int vertU = 0; vertU < graph.length; vertU++) {

                if (!partOfMST[vertU])
                    continue;

                for (int vertV = 0; vertV < graph.length; vertV++) {
                    if (graph[vertU][vertV] != 0 && !partOfMST[vertV]) {
                        if (graph[vertU][vertV] < minWeight) {
                            chosenVertU = vertU;
                            chosenVertV = vertV;
                            minWeight = graph[vertU][vertV];
                        }
                    }
                }
            }

            partOfMST[chosenVertV] = true;
            List<Integer> edge = new ArrayList<>();
            edge.add(chosenVertU);
            edge.add(chosenVertV);
            edgeList.add(edge);

        }

        return edgeList;
    }

}
