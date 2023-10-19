package Backtracking;

public class FindSubSet {
    public static void main(String[] args) {
        String str = "abc";
        printSubSet(str, "", 0);

    }

    public static void printSubSet(String str, String ans, int i) {
        // Base case
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }
        printSubSet(str, ans + str.charAt(i), i + 1);
        printSubSet(str, ans, i + 1);
    }
}
