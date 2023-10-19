package Strings;

public class SubString {
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(subString(str, 0, 4));
        System.out.println(str.substring(0, 5));
    }

    public static String subString(String str, int startIndex, int endIndex) {
        String substr = "";
        for (int i = startIndex; i < endIndex; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
}
