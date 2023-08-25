public class floydsTriangle {
    public static void main(String[] args) {
        int x = 1;
        int n = 10;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (x < 10) {
                    System.out.print(x + "  ");
                    x++;
                } else {
                    System.out.print(x + " ");
                    x++;
                }
            }
            System.out.println();
        }

    }
}
