package Array2D;

import java.util.Scanner;

public class array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[4][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        printMatrix(matrix);
    }

    public static void printMatrix(int arr[][]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                max = Math.max(max, arr[i][j]);
                min = Math.min(min, arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Largest element in the array is " + max);
        System.out.println("Smallest element in the array is " + min);
    }

}
