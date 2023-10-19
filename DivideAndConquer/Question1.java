package DivideAndConquer;

import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        String arr[] = { "sun", "earth", "mars", "mercury" };
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    public static void mergeSort(String arr[], int si, int ei) {
        // Base Case
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);

        // Adding the Array
        merge(arr, si, mid, ei);

    }

    public static void merge(String arr[], int si, int mid, int ei) {
        String temp[] = new String[ei - si + 1];

        // Iterators
        int i = si;
        int j = mid + 1;
        int k = 0; // for temp Array

        while (i <= mid && j <= ei) {
            if (arr[i].compareTo(arr[j]) < 0) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // for copying from temp to arr
        for (i = si, k = 0; k < temp.length; i++, k++) {
            arr[i] = temp[k];
        }

    }
}
