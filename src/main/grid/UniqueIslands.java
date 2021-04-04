package main.grid;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueIslands {

    private static boolean walk(int[][] grid, int row, int col, boolean[][] visited, List<String> signature) {

        if (visited[row][col] || grid[row][col] != 1)
            return false;

        visited[row][col] = true;

        if (col + 1 < grid[0].length && !visited[row][col + 1] && grid[row][col + 1] == 1) {
            signature.add("R");
            walk(grid, row, col + 1, visited, signature);
        }

        if (row + 1 < grid.length && !visited[row + 1][col] && grid[row + 1][col] == 1) {
            signature.add("D");
            walk(grid, row + 1, col, visited, signature);
        }

        if (row - 1 >= 0 && !visited[row - 1][col] && grid[row - 1][col] == 1) {
            signature.add("U");
            walk(grid, row - 1, col, visited, signature);
        }

        if (col - 1 >= 0 && !visited[row][col - 1] && grid[row][col - 1] == 1) {
            signature.add("L");
            walk(grid, row, col - 1, visited, signature);
        }

        signature.add("0");
        return true;
    }

    // you track the signature trail of DFS, you increment only if
    // the signatures are unique; 
    // you add a terminating symbol to distinguish backtracked sequences
    public static int numDistinctIslands(int[][] grid) {
        int count = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        Set<List<String>> signatureSet = new HashSet<>();

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {

                List<String> sign = new ArrayList<>();
                if (walk(grid, row, col, visited, sign)) {
                    if (!signatureSet.contains(sign)) {
                        count++;
                        signatureSet.add(sign);
                    }
                }
            }
        }
        return count;
    }
    
}
