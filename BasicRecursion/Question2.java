package BasicRecursion;

public class Question2 {
    public static void main(String[] args) {
        int y = 1579;
        String str = Integer.toString(y);

        printNumbers(str, 0);
    }

    static String numbers[] = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };

    public static void printNumbers(String str, int i) {
        // Base Case
        if (i == str.length()) {
            return;
        }

        if (str.charAt(str.length() - 1) != '0') {

            System.out.print(numbers[Character.getNumericValue(str.charAt(i))] + " ");

        }

        printNumbers(str, i + 1);

    }
}
