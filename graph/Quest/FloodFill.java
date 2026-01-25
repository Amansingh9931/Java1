import java.util.Arrays;

public class FloodFill {
    public static void helper(int[][] image, int sr, int sc, int color, boolean[][] vis, int orgCol) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgCol)
            return;

        // mark visited
        vis[sr][sc] = true;

        // recolor the current pixel
        image[sr][sc] = color;

        // left
        helper(image, sr, sc - 1, color, vis, orgCol);
        // right
        helper(image, sr, sc + 1, color, vis, orgCol);
        // up
        helper(image, sr - 1, sc, color, vis, orgCol);
        // down
        helper(image, sr + 1, sc, color, vis, orgCol);
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] vis = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }

    public static void main(String[] args) {
        int[][] image = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };
        int sr = 1, sc = 1, color = 2;

        int[][] result = floodFill(image, sr, sc, color);

        // Option 1: Print using Arrays.deepToString
        // System.out.println(Arrays.deepToString(result));

        // Option 2: Print row by row
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}