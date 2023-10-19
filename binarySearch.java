public class binarySearch {
    public static void main(String[] args) {
        int numbes[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 8;
        int index = binarySearchFunction(numbes, key);
        System.out.println(index);

    }

    public static int binarySearchFunction(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;

            // Comparison
            if (key == numbers[mid]) {
                return mid;
            } else if (key > numbers[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
