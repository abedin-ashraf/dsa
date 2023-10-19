package ArrayList;

import java.util.ArrayList;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list2D = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list2D.add(list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(10);
        list2D.add(list2);
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(6);
        list3.add(9);
        list3.add(12);
        list3.add(15);

        list2D.add(list3);

        System.out.println(list2D);

        for (int i = 0; i < list2D.size(); i++) {
            for (int j = 0; j < list2D.get(i).size(); j++) {
                System.out.print(list2D.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
}