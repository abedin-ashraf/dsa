package Sorting;

public class BubbleSortForSortedArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSort(int arr[]) {
        int swap = 0;
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swap++;
                }
                if (swap == 0) {
                    break;
                }
            }
        }
    }

}
