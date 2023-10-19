package BasicRecursion;

public class Problem2 {
    public static void main(String[] args) {
        printNumbersIncreasingOrder(5);
    }

    public static void printNumbersIncreasingOrder(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printNumbersIncreasingOrder(n - 1);
        System.out.println(n);
    }
}
