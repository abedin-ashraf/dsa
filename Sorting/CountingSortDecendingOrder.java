package Sorting;

public class CountingSortDecendingOrder {
    public static void main(String[] args) {

        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        countingSortDecendingOrder(arr);
        printArray(arr);
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void countingSortDecendingOrder(int arr[]) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        int j = 0;
        for (int i = max; i >= 0; i--) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }
}
