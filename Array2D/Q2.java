package Array2D;

public class Q2 {
    public static void main(String[] args) {
        int[][] nums = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        System.out.println(sumOfRow(nums, 1));

    }

    public static int sumOfRow(int[][] arr, int row) {
        int sum = 0;
        for (int j = 0; j < arr[row].length; j++) {
            sum += arr[row][j];
        }
        return sum;
    }
}
