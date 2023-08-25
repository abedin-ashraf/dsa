public class palindromicNumberPattern {
    public static void main(String[] args) {
        palindromicNumberPatternFunction(5);
    }

    public static void palindromicNumberPatternFunction(int n) {

        // Outer Loop
        for (int i = 1; i <= n; i++) {
            // (n-i)*Space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            //
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            // (n-i)*Space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
