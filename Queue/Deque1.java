package Queue;

import java.util.*;

public class Deque1 {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.add(1);
        System.out.println(dq);
        dq.addFirst(2);
        System.out.println(dq);
        dq.addLast(3);
        System.out.println(dq);

        System.out.println(dq.pop());
        System.out.println(dq);
    }
}
