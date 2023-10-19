package BasicRecursion;

public class FindFirstOccurence {
    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        int key = 55;

        System.out.println(firstOccurence(arr, key, 0));
    }

    public static int firstOccurence(int arr[], int key, int i) {
        if (arr[i] == key) {
            return i;
        }
        if (i == arr.length - 1) {
            return -1;
        }
        return firstOccurence(arr, key, i + 1);
    }
}
