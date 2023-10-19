public class printPrimeInRange {
    public static void main(String[] args) {
        primeInRange(100);
    }

    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i) == true) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int x) {
        if (x == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
