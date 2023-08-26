import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int nums[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        System.out.println(findK(nums, 4, 4, 10));
    }

    public static int findK(int A[][], int n, int m, int k) {
        // Your code here
        int arr[] = new int[m * n + 2];
        int startRow = 0;
        int endRow = n - 1;
        int startCol = 0;
        int endCol = m - 1;

        int count = 0;

        while (startRow <= endRow && startCol <= endCol) {
            // Upper side
            for (int j = startCol; j <= endCol; j++) {
                arr[count] = A[startRow][j];
                count++;
            }
            // Right Side
            for (int i = startRow + 1; i <= endRow; i++) {
                if (startCol == endCol) {
                    break;
                }
                arr[count] = A[i][endCol];
                count++;
            }
            // bottom side
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                arr[count] = A[endRow][j];
                count++;
            }
            // Left side
            for (int i = endRow - 1; i >= startRow; i--) {
                if (startCol == endCol) {
                    break;
                }
                arr[count] = A[i][startCol];
                count++;
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

        return arr[k - 1];
    }
}