package Sorting;

public class SelectionSortDecendingOrder {
    public static void main(String[] args) {

        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        selectionSortDecendingOrder(arr);
        printArray(arr);
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void selectionSortDecendingOrder(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int tempIndex = 0;
            int max = 0;
            for (int j = i; j < arr.length; j++) {

                if (arr[j] > max) {
                    tempIndex = j;
                    max = arr[j];
                }
            }
            int temp = arr[tempIndex];
            arr[tempIndex] = arr[i];
            arr[i] = temp;
        }
    }

}
