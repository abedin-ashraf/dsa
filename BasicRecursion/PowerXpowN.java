package BasicRecursion;

public class PowerXpowN {
    public static void main(String[] args) {
        System.out.println(pow(2, 10));
    }

    public static int pow(int x, int n) {
        if (n == 1) {
            return x;

        }
        return x * pow(x, n - 1);
    }
}
