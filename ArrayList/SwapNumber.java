package ArrayList;

import java.util.ArrayList;

public class SwapNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println("Before Swap: " + list);
        int idx1 = 1, idx2 = 3;
        swap(list, idx1, idx2);
        System.out.println("After Swap: " + list);

    }

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, idx2);
        list.set(idx2, temp);

    }
}
