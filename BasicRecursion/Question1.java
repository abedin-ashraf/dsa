package BasicRecursion;

public class Question1 {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        int key = 2;
        keyOccuerence(arr, 0, key);

    }

    public static void keyOccuerence(int arr[], int i, int key) {
        // Base Case
        if (i == arr.length) {
            return;
        }

        // Logic
        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        keyOccuerence(arr, i + 1, key);
    }
}
