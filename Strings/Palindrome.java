package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String str1 = "racecar";
        System.out.println(palindrome(str1));
        String str2 = "noon";

    }

    public static boolean palindrome(String str) {
        boolean palindrome = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                palindrome = false;
            }
        }
        return palindrome;
    }
}
