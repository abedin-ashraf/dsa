package BitManipulation;

public class FastExponentiation {
    public static void main(String[] args) {
        System.out.println(fastExponentiation(5, 3));
    }

    public static long fastExponentiation(int a, int n) { // a^n
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }

            a *= a;
            n = n >> 1;
        }

        return ans;
    }
}