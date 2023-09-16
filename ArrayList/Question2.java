package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Question2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        Collections.sort(list);
        System.out.println(lonelyNumbers(list));
    }

    public static ArrayList<Integer> lonelyNumbers(ArrayList<Integer> list) {
        ArrayList<Integer> solution = new ArrayList<>();

        for (int i = 0; i < list.size() - 1; i++) {
            if (((list.get(i) - list.get(i + 1) != 0) || list.get(i) - list.get(i - 1) != 0)
                    && ((Math.abs(list.get(i) - list.get(i + 1)) != 1)
                            || Math.abs(list.get(i) - list.get(i - 1)) != 1)) {
                solution.add(list.get(i));
            }
        }

        return solution;

    }
}
