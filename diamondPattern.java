public class diamondPattern {
    public static void main(String[] args) {
        diamondPatternFunction(4);
    }

    public static void diamondPatternFunction(int n) {
        // (n-i)*Space + i*Asterisk + (n-i)*Space

        // Outer Loop
        for (int i = 1; i <= n; i++) {
            // (n-i)*Space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // i*Asterisk
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            // (n-i)*Space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("");
            }

            System.out.println();
        }
        // Outer Loop
        for (int i = n; i >= 1; i--) {
            // (n-i)*Space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // i*Asterisk
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            // (n-i)*Space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("");
            }

            System.out.println();
        }
    }
}
