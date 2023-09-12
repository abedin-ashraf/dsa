package Backtracking;

public class GridWays {
    public static void main(String[] args) {
        System.out.println(gridWays(3, 0, 0));
    }

    public static int gridWays(int n, int row, int column) {

        // Base Case
        if (row == n - 1 && column == n - 1) {
            return 1;
        } else if (column == n || row == n) {
            return 0;
        }
        // right
        int way1 = gridWays(n, row, column + 1);
        int way2 = gridWays(n, row + 1, column);

        return way1 + way2;

    }
}
