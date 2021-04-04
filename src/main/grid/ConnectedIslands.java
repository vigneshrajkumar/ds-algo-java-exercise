package main.grid;

public class ConnectedIslands {

    private static void walk(int[][] map, boolean[][] visited, int row, int col) {
        visited[row][col] = true;

        if (row - 1 >= 0 && !visited[row - 1][col] && map[row - 1][col] == 1)
            walk(map, visited, row - 1, col);

        if (row + 1 < map.length && !visited[row + 1][col] && map[row + 1][col] == 1)
            walk(map, visited, row + 1, col);

        if (col - 1 >= 0 && !visited[row][col - 1] && map[row][col - 1] == 1)
            walk(map, visited, row, col - 1);

        if (col + 1 < map[0].length && !visited[row][col + 1] && map[row][col + 1] == 1)
            walk(map, visited, row, col + 1);
    }

    public static int findIslands(int[][] map) {

        int islands = 0;

        boolean[][] visited = new boolean[map.length][map[0].length];

        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[0].length; col++) {
                if (map[row][col] == 1 && !visited[row][col]) {
                    islands++;
                    walk(map, visited, row, col);
                }
            }
        }

        return islands;
    }
    
}
