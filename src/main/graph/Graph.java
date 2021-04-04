package main.graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    private List<List<Integer>> edgelist;
    
    public Graph(int nodeCount) {
        edgelist = new ArrayList<>();

        while (nodeCount > 0) {
            edgelist.add(new ArrayList<>());
            nodeCount--;
        }
    }

    public int size() {
        return edgelist.size();
    }

    public List<Integer> connections(int index) {
        return edgelist.get(index);
    }

    public void addEdge(int from, int to){
        edgelist.get(from).add(to);
    }

    public void print() {
        for(List<Integer> l : edgelist)
            System.out.println(l);
    }

    @Override
    public String toString() {
        return edgelist.toString();
    }

}
