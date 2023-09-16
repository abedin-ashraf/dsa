package ArrayList;

import java.util.ArrayList;

public class Qustion4 {
    public static void main(String[] args) {
        System.out.println(beautifulArrayList(5));
    }

    public static ArrayList<Integer> beautifulArrayList(int n) {
        int arr[] = new int[n];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i;

        }
        // For odd numbers
        for (int i = 0; i < arr.length; i++) {
            int num = 2 * arr[i] - 1;
            if (num <= n) {
                list.add(num);
            }
        }

        // for even numbers
        for (int i = 0; i < arr.length; i++) {
            int num = 2 * arr[i];
            if (num <= n) {
                list.add(num);
            }
        }
        return list;
    }
}
