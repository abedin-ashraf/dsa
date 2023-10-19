package Backtracking;

public class FindPermutationsInString {
    public static void main(String[] args) {
        String str = "abc";
        findPermutationsInString(str, "");
    }

    public static void findPermutationsInString(String str, String ans) {
        // Base Case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // Recursion
        for (int i = 0; i < str.length(); i += 1) {
            char currChar = str.charAt(i);
            // Remove the currChar from string
            // "abcde" where c= currChar => "ab" + "de" =>"abde"
            String newStr = str.substring(0, i) + str.substring(i + 1);

            findPermutationsInString(newStr, ans + currChar);
        }

    }
}
