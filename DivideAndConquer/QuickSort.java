package DivideAndConquer;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = { 9, 7, 6, 4, 6, 8, 9, 3, 7 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int arr[], int si, int ei) {
        // Base Case
        if (si >= ei) {
            return;
        }

        int pivotIndex = partition(arr, si, ei);

        quickSort(arr, si, pivotIndex - 1); // For Left Side
        quickSort(arr, pivotIndex + 1, ei); // For Right side
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // For making place for elements smaller than pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }
        // For pivot
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }
}
