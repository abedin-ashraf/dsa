package ArrayList;

import java.util.ArrayList;

public class Question1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(2);
        // list.add(4);

        System.out.println(monotonic(list));

    }

    public static boolean monotonic(ArrayList<Integer> list) {

        for (int i = 0; i < list.size() - 1; i++) {
            if (((list.get(i) - list.get(i + 1)) == 0) || (Math.abs(list.get(i) - list.get(i + 1)) == 1)) {

            } else {
                return false;
            }
        }

        return true;
    }
}
