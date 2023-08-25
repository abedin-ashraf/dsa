public class numberPyramidPattern {
    public static void main(String[] args) {
        numberPyramidPatternFunction(5);
    }

    public static void numberPyramidPatternFunction(int n) {
        // (n-i)*Space + i-th Number + (n-i)*Space

        // Outer loop
        for (int i = 1; i <= n; i++) {

            // (n-i)*Space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // i-th Number
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            // (n-i)*Space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
