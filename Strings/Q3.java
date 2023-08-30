package Strings;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        String str = "race";
        String str2 = "care";

        System.out.println(anagrams(str, str2));
    }

    public static boolean anagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        } else {
            char[] str1ToArray = str1.toCharArray();
            char[] str2ToArray = str2.toCharArray();

            Arrays.sort(str1ToArray);
            Arrays.sort(str2ToArray);

            if (Arrays.equals(str1ToArray, str2ToArray)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
