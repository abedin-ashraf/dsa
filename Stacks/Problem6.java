package Stacks;

import java.util.Stack;

public class Problem6 {
    public static void main(String[] args) {
        String str = "({})[]";
        System.out.println(validParentheses(str));
    }

    public static boolean validParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Opening
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if ((ch == ')' && stack.peek() == '(') || (ch == '}' && stack.peek() == '{')
                        || (ch == ']' && stack.peek() == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
