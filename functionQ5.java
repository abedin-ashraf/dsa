public class functionQ5 {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(111));
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }
}
