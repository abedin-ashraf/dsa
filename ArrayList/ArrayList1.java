package ArrayList;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5); // O(1)
        System.out.println(list);

        list.add(2, 33); // O(n)
        System.out.println(list);

        System.out.println(list.get(3));

        list.remove(2);
        System.out.println(list);

        list.set(1, 4);
        System.out.println(list);

        System.out.println(list.contains(4));

        // Size
        System.out.println(list.size());

    }
}
