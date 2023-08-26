package Array2D;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int matrix[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };

        int key = 33;

        boolean keyFound = stairCaseSearch(matrix, key);

        boolean keyFound2 = stairCaseSearch2(matrix, key);

    }

    // For (0,n-1)cell
    public static boolean stairCaseSearch(int arr[][], int key) {
        int row = 0;
        int col = arr.length - 1;

        while (row < arr.length && col >= 0) {
            if (arr[row][col] == key) {
                System.out.println("Found key at (" + row + "," + col + ")");
                return true;
            } else if (arr[row][col] > key) {
                col--;
            } else if (arr[row][col] < key) {
                row++;
            }
        }
        return false;
    }

    // For (n-1, 0)
    public static boolean stairCaseSearch2(int arr[][], int key) {
        int row = arr.length - 1;
        int col = 0;

        while (row >= 0 && col < arr.length) {
            if (arr[row][col] == key) {
                System.out.println("Found key at (" + row + "," + col + ")");
                return true;
            } else if (key > arr[row][col]) {
                col++;
            } else if (key < arr[row][col]) {
                row--;
            }
        }
        return false;
    }
}
