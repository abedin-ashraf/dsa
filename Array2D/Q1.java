/*
 
 */

package Array2D;

public class Q1 {
    public static void main(String[] args) {
        int[][] array = { { 4, 7, 8 }, { 8, 8, 7 } };
        System.out.println(numberCountInMatrix(array, 7));
    }

    public static int numberCountInMatrix(int[][] arr, int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == key) {
                    count++;
                }
            }
        }
        return count;
    }
}
