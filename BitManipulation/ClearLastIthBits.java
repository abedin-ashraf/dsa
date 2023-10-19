package BitManipulation;

public class ClearLastIthBits {
    public static void main(String[] args) {
        System.out.println(clearLastIthBits(15, 2));
    }

    public static int clearLastIthBits(int n, int i) {
        int bitMask = ~0 << i;
        return n & bitMask;
    }

}
