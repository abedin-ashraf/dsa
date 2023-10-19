package BitManipulation;

public class ClearIthPosition {
    public static void main(String[] args) {
        System.out.println(clearIthPosition(10, 1));
    }

    public static int clearIthPosition(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }
}
