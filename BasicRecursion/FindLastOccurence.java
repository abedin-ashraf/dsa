package BasicRecursion;

public class FindLastOccurence {
    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        int key = 5;

        System.out.println(lastOccurence(arr, key, arr.length - 1));
        System.out.println(lastOccurence2(arr, key, 0));
    }

    public static int lastOccurence(int arr[], int key, int i) {

        if (arr[i] == key) {

            return i;
        }
        if (i == 0) {
            return -1;
        }
        return lastOccurence(arr, key, i - 1);
    }

    public static int lastOccurence2(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence2(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }
}
