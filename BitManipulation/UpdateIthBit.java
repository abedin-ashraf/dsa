package BitManipulation;

public class UpdateIthBit {
    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
    }

    public static int updateIthBit(int n, int i, int newBit) {
        n = n & ~(1 << i);
        int bitMask = newBit << i;
        return n | bitMask;
    }
}
