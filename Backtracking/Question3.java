package Backtracking;

public class Question3 {
    public static void main(String[] args) {
        solveKT();
    }

    public static boolean solveKT() {
        int sol[][] = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sol[i][j] = -1;
            }
        }

        int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int yMove[] = { 1, 2, 2, 1, -1, -2, -2, 1 };

        // As the Knight starts from cell(0,0)
        sol[0][0] = 0;

        if (!solveKTUtilities(0, 0, 1, sol, xMove, yMove)) {
            System.out.println("Solution doesn't exists");
        } else {
            printSolution(sol);
        }
        return true;
    }

    public static boolean solveKTUtilities(int x, int y, int movei, int sol[][], int xMove[], int yMove[]) {
        int k, next_x, next_y;

        if (movei == 9 * 9) {
            return true;
        }

        for (k = 0; k < 8; k++) {
            next_x = x + xMove[k];
            next_y = y + yMove[k];

            if (isSafe(next_x, next_y, sol)) {
                sol[next_x][next_y] = movei;
                if (solveKTUtilities(next_x, next_y, movei + 1, sol, xMove, yMove)) {
                    return true;
                } else {
                    sol[next_x][next_y] = -1;// Backtracking
                }
            }
        }
        return false;
    }

    public static void printSolution(int sol[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int x, int y, int sol[][]) {
        return (x >= 0 && x < 9 && y >= 0 && y < 9 && sol[x][y] == -1);
    }
}
