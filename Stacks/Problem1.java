package Stacks;

import java.util.Stack;

//Push at the bottom of the stack
public class Problem1 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);

        pushAtBottom(s, 5);

        System.out.println(s);
        pushAtBottom(s, 4);

        System.out.println(s);
    }

    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
}
