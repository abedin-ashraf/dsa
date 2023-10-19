package Backtracking;

public class Question1 {
    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };

        int sol[][] = new int[maze.length][maze.length];
        System.out.println(ratMaze(maze, sol, 4, 0, 0));
        printmaze(sol);
    }

    public static int ratMaze(int maze[][], int sol[][], int n, int row, int col) {
        // Base Case
        if (row == n - 1 && col == n - 1) {
            sol[row][col] = 1;
            return 1;
        } else if (row >= n || col >= n || row < 0 || col < 0) {
            return 0;
        }

        // Recursion
        int way2 = 0, way4 = 0;
        if (maze[row][col] != 0) {
            sol[row][col] = 1;
            // Up
            // int way1 = ratMaze(n, row - 1, col);
            // Down
            way2 = ratMaze(maze, sol, n, row + 1, col);
            // Left
            // int way3 = ratMaze(n, row, col - 1);
            // Right
            way4 = ratMaze(maze, sol, n, row, col + 1);

        }

        return way2 + way4;
    }

    public static boolean isSafe(int maze[][], int row, int col) {
        if (row >= 0 && row < maze.length && col >= 0 && col < maze.length && maze[row][col] == 1) {
            return true;
        }
        return true;
    }

    public static void printmaze(int[][] maze) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }
}
