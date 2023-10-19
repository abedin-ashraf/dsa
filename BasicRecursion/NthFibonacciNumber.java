package BasicRecursion;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        System.out.println(nthFIbonacciNumber(25));
    }

    public static int nthFIbonacciNumber(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return nthFIbonacciNumber(n - 1) + nthFIbonacciNumber(n - 2);
    }
}
