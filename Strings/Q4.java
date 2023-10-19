package Strings;

public class Q4 {
    public static void main(String[] args) {
        String str = "hi, i am ashraf";
        System.out.println(toUpperCase(str));
        String str2 = " hello  world  ";
        System.out.println(toUpperCase(str2));
    }

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == ' ') {
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }

        }

        return sb.toString();
    }
}
