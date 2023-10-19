package BitManipulation;

public class Q3 {
    public static void main(String[] args) {
        // System.out.println(7 ^ 0);
        System.out.println(-~3);
        System.out.println((3 << 1) - 3 + 1);
        System.out.println(add1UsingBitManipulation(777));

        System.out.println(~3);
    }

    public static int add1UsingBitManipulation(int x) {
        return (x << 1) - x + 1;
    }
}
