package Backtracking;

public class FindSubSetUsingStringBuilder {
    public static void main(String[] args) {
        String str = "abc";
        findSubSetUsingStringBuilder(str, new StringBuilder(""), 0);
    }

    public static void findSubSetUsingStringBuilder(String str, StringBuilder sb, int i) {
        // Base Case
        if (i == str.length()) {
            System.out.println(sb.toString());
            return;
        }
        // Recursion
        // Choice yes
        findSubSetUsingStringBuilder(str, sb.append(str.charAt(i)), i + 1);
        sb.deleteCharAt(sb.length() - 1);
        // Choice No
        findSubSetUsingStringBuilder(str, sb, i + 1);
    }
}
