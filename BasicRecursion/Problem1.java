package BasicRecursion;

public class Problem1 {
    public static void main(String[] args) {
        int x = 10;
        printNumbers(x);
    }

    public static void printNumbers(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNumbers(n - 1);

    }
}
