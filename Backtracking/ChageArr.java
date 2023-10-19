package Backtracking;

import java.util.Arrays;

public class ChageArr {
    public static void main(String[] args) {
        int arr[] = new int[5];

        changeArr(arr, 0, 1);
        System.out.println("After backtracking " + Arrays.toString(arr));
    }

    public static void changeArr(int arr[], int index, int val) {
        // Base Case
        if (index == arr.length) {
            System.out.println("Before backtracking " + Arrays.toString(arr));
            return;
        }
        // Recursion
        arr[index] = val;
        changeArr(arr, index + 1, val + 1);
        arr[index] = arr[index] - 2; // Backtracking

    }

}
