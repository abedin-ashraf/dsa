package Sorting;

public class InsertionSortDecendingOrder {
    public static void main(String[] args) {

        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        insertionSortDecendingOrder(arr);
        printArray(arr);
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertionSortDecendingOrder(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int previous = i - 1;

            while (previous >= 0 && arr[previous] < curr) {
                arr[previous + 1] = arr[previous];
                previous--;
            }

            arr[previous + 1] = curr;
        }
    }
}
