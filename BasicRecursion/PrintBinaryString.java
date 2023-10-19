package BasicRecursion;

public class PrintBinaryString {
    public static void main(String[] args) {
        printBinaryString(3, 0, "");
    }

    public static void printBinaryString(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // for 00 & 10 case
        printBinaryString(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinaryString(n - 1, 1, str + "1");
        }
    }
}
