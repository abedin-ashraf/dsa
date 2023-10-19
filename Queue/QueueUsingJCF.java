package Queue;

import java.util.*;

public class QueueUsingJCF {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); // ArrayDeque
        Queue<Integer> r = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);

        r.add(11);
        r.add(22);
        r.add(33);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

        while (!r.isEmpty()) {
            System.out.println(r.peek());
            r.remove();
        }
    }
}
