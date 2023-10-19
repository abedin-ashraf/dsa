package ArrayList;

import java.util.ArrayList;

public class Qestion3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // list.add(1);
        // list.add(100);
        // list.add(200);
        // list.add(1);
        // list.add(100);

        list.add(12);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);

        System.out.println(mostFrequentNumberFollowingKey(list, 2));

    }

    public static int mostFrequentNumberFollowingKey(ArrayList<Integer> list, int key) {
        int target = list.get(key);

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == key && list.get(i + 1) == target) {
                return list.get(key);
            }

        }
        return 0;
    }
}
