
package Strings;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // char arr[] = { 'a', 'b', 'c', 'd' };
        // String str = "abcd";
        // String str2 = new String("xyz");

        // // Strings are Immutable
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);

        // System.out.println(name.length());

        // Concatination
        String firstName = "Mohammed Nurul Abedin";
        String lastName = "Ashraf";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        printLetters(fullName);
        System.out.println(countVowels(fullName));

    }

    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                System.out.print(str.charAt(i) + " ");
            }
        }
        System.out.println();
    }

    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u'
                    || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'
                    || str.charAt(i) == 'U') {
                count++;
            }
        }
        return count;
    }
}
