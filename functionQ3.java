public class functionQ3 {
    public static void main(String[] args) {
        System.out.println(isPalindreome(123));
    }

    public static boolean isPalindreome(int n) {
        int x = n;
        int y = 0;
        while (n > 0) {
            y = y * 10 + (n % 10);
            n /= 10;
        }

        if (x == y) {
            return true;
        }
        return false;
    }
}
