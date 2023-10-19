package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(6);
        list.add(9);
        list.add(8);
        list.add(12);
        list.add(10);
        list.add(11);
        list.add(14);
        System.out.println(list.toString());
        System.out.println(list.get(0));
        System.out.println(list.remove(1));
        System.out.println(list.toString());
        System.out.println(list.contains(2));
        Collections.sort(list);
        System.out.println(list.toString());

    }
}
