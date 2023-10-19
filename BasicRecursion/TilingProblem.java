package BasicRecursion;

public class TilingProblem {
    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }

    public static int tilingProblem(int n) { // Floor size 2 * n
        if (n == 0 || n == 1) {
            return 1;
        }
        // Vertical Choice
        int verticalWays = tilingProblem(n - 1);
        // horizontal choice
        int horizontalWays = tilingProblem(n - 2);

        return verticalWays + horizontalWays;

    }
}
