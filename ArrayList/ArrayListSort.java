package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(22);
        list.add(32);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(23);
        list.add(20);

        System.out.println("Befor sort: " + list);

        Collections.sort(list);
        System.out.println("After sort: " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sort in reverse Order: " + list);

    }
}
