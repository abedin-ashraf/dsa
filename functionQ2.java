public class functionQ2 {
    public static void main(String[] args) {
        System.out.println(isEven(11));
    }

    // function to check if a number is even or not
    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }
}
