package Backtracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'X';
            }
        }
        nQueens(board, 0);
        System.out.println("Total ways to solve n Queens: " + count);
    }

    static int count = 0;

    public static void nQueens(char board[][], int row) {
        // Base Case
        if (row == board.length) {
            System.out.println("-----------ChessBoard-------------");
            printBoard(board);
            count++;
            return;
        }
        // Recursion
        for (int col = 0; col < board.length; col += 1) {

            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                nQueens(board, row + 1); // function call
                board[row][col] = 'X'; // Backtracking
            }

        }
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // Vertical Up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // Diagonal left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // Diagonal right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void printBoard(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

}
