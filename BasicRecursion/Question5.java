package BasicRecursion;

public class Question5 {
    public static void main(String[] args) {
        System.out.println(towersOfHanoi(4));
    }

    public static int towersOfHanoi(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 3;
        }

        return towersOfHanoi(n - 1) + towersOfHanoi(n - 1) + 1;
    }
}
