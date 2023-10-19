package ArrayList;

import java.util.ArrayList;

public class PairSum2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        System.out.println(pairSum(list, target));
    }

    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int n = list.size();
        int pivotIndex = -1;
        for (int i = 1; i < n; i++) {
            if (list.get(i - 1) > list.get(i)) {
                pivotIndex = i - 1;
                break;
            }
        }

        int leftPointer = pivotIndex + 1; // smallest value
        int rightPointer = pivotIndex; // LargestValue;

        while (leftPointer != rightPointer) {
            if (list.get(leftPointer) + list.get(rightPointer) == target) {
                return true;

            } else if (list.get(leftPointer) + list.get(rightPointer) < target) {
                leftPointer = (leftPointer + 1) % n;
            } else { // list.get(leftPointer)+list.get(rightPointer)>target
                rightPointer = (n + rightPointer - 1) % n;
            }
        }
        return false;
    }
}
