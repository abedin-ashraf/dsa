package Backtracking;

public class SudokoSolver {
    public static void main(String[] args) {
        int sudoko[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0, },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };

        System.out.println(sudokoSolver(sudoko, 0, 0));

    }

    public static boolean sudokoSolver(int sudoko[][], int row, int col) {
        // Base Case
        if (row == 9 && col == 0) {
            printsudoko(sudoko);
            return true;

        }

        // Recursion
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if (sudoko[row][col] != 0) {
            return sudokoSolver(sudoko, nextRow, nextCol);
        }

        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoko, row, col, digit)) {
                sudoko[row][col] = digit;
                if (sudokoSolver(sudoko, nextRow, nextCol)) {
                    return true;
                }
                sudoko[row][col] = 0;
            }
        }
        return false;
    }

    public static boolean isSafe(int sudoko[][], int row, int col, int digit) {
        // Column
        for (int i = 0; i <= 8; i++) {
            if (sudoko[i][col] == digit) {
                return false;
            }
        }

        // Row
        for (int j = 0; j <= 8; j++) {
            if (sudoko[row][j] == digit) {
                return false;
            }
        }

        // Grid
        int startRowIndex = (row / 3) * 3;
        int startColumnIndex = (col / 3) * 3;
        for (int i = startRowIndex; i < startRowIndex + 3; i++) {
            for (int j = startColumnIndex; j < startColumnIndex + 3; j++) {
                if (sudoko[startRowIndex][startColumnIndex] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void printsudoko(int sudoko[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoko[i][j] + " ");
            }
            System.out.println();
        }
    }
}