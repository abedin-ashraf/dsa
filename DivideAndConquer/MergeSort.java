package DivideAndConquer;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 9, 7, 6, 4, 6, 8, 9, 3, 7 };
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int arr[], int si, int ei) {
        // Base Case for Recursion
        if (si >= ei) {
            return;
        }
        // si + (ei-si)/2 == (si+ei)/2
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);

        // Merge
        merge(arr, si, mid, ei);

    }

    public static void merge(int arr[], int si, int mid, int ei) {
        // Create a temp array size should be ei-si+1
        int temp[] = new int[(ei - si) + 1];

        // Iterators
        int i = si; // for left side
        int j = mid + 1; // for rigth side
        int k = 0; // for temp array

        // Iteration
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else { // for arr[i] > arr[j]
                temp[k] = arr[j];
                j++;
                k++;
            }
        }

        // for left side leftover
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // for right side leftover
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // For copy from temp to original array
        for (i = si, k = 0; k < temp.length; i++, k++) {
            arr[i] = temp[k];
        }
    }
}
