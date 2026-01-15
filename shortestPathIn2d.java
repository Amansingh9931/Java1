import java.util.*;

public class shortestPathIn2d {

    static class Cell {
        int x, y, dist;

        Cell(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

    static boolean isValid(int x, int y, int m, int n, int[][] grid, boolean[][] visited) {
        return x >= 0 && y >= 0 && x < m && y < n && grid[x][y] == 0 && !visited[x][y];
    }

    static int minMoves(int[][] grid, int[] src, int[] dest, int[] move) {
        int m = grid.length, n = grid[0].length;

        int[][] dirs = {
            { move[0], move[1] },
            { -move[0], -move[1] },
            { move[0], -move[1] },
            { -move[0], move[1] }
        };

        boolean[][] visited = new boolean[m][n];
        Queue<Cell> q = new LinkedList<>();
        q.add(new Cell(src[0], src[1], 0));
        visited[src[0]][src[1]] = true;

        while (!q.isEmpty()) {
            Cell curr = q.poll();

            if (curr.x == dest[0] && curr.y == dest[1]) return curr.dist;

            for (int[] dir : dirs) {
                int nx = curr.x + dir[0];
                int ny = curr.y + dir[1];

                if (isValid(nx, ny, m, n, grid, visited)) {
                    visited[nx][ny] = true;
                    q.add(new Cell(nx, ny, curr.dist + 1));
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[][] grid = {
            { 0, 1, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 1 },
            { 0, 1, 0, 0, 0, 0 },
            { 1, 1, 0, 0, 0, 1 },
            { 0, 0, 0, 0, 0, 0 },
            { 1, 1, 0, 0, 1, 0 }
        };

        int[] src = {1, 0};
        int[] dest = {5, 3};
        int[] move = {1, 2};

        int ans = minMoves(grid, src, dest, move);
        System.out.println(ans);
    }
}