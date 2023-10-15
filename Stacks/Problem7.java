package Stacks;

import java.util.Stack;

public class Problem7 {
    public static void main(String[] args) {
        String s = "(((a+b)+(b+c)))";
        System.out.println(duplicateParentheses(s));
    }

    public static boolean duplicateParentheses(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ')') {
                s.push(ch);
            } else {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                }
                s.pop();
            }

        }
        return false;
    }
}
