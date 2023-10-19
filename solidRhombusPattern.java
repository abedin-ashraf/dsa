public class solidRhombusPattern {
    public static void main(String[] args) {
        solidRhombusPatternFunction(5);
    }

    public static void solidRhombusPatternFunction(int n) {
        // (n-i)* Space + n*asterisk

        // Outer Loop
        for (int i = 1; i <= n; i++) {
            // (n-i)*Space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // n*asterisk
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}