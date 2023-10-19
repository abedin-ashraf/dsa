public class butterflyPattern {
    public static void main(String[] args) {
        butterflyPatternFunction(5);
    }

    public static void butterflyPatternFunction(int n) {
        for (int i = 1; i <= n; i++) {
            // i*star + 2(n-i)*space + i*star

            // i*star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 2(n-1)*Space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // i*star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Mirror
        for (int i = n; i >= 1; i--) {
            // i*star + 2(n-i)*space + i*star

            // i*star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 2(n-1)*Space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // i*star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
