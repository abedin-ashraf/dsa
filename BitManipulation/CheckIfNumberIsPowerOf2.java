package BitManipulation;

public class CheckIfNumberIsPowerOf2 {
    public static void main(String[] args) {
        System.out.println(powerOf2(8));
    }

    public static boolean powerOf2(int n) {
        if ((n & (n - 1)) == 0) {
            return true;
        }
        return false;
    }
}
