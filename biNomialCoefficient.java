public class biNomialCoefficient {
    public static void main(String[] args) {
        System.out.println(biNomialCoEfficient(5, 2));

    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int biNomialCoEfficient(int n, int r) {

        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int biCoeff = fact_n / (fact_r * fact_nmr);
        return biCoeff;
    }
}
