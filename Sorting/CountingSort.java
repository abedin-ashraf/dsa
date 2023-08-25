package Sorting;

public class CountingSort {

    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 3, 2 };
        countingSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void countingSort(int arr[]) {
        int count[] = new int[arr.length + 1];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        int j = 0;
        for (int i = 0; i < (max) + 1; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
}
