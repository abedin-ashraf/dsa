package BitManipulation;

public class OddOrEven {
    public static void main(String[] args) {
        oddOrEven(5);
    }

    public static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
