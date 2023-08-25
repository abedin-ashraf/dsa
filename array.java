import java.util.*;

public class array {
    public static void main(String[] args) {

        // Creating an array
        int marks[] = new int[50];
        int numbers[] = { 1, 2, 3 };
        int moreNumber[] = { 4, 5, 6 };
        String fruits[] = { "Apple", "Banana", "Mango" };

        // Input
        // Scanner input = new Scanner(System.in);
        // marks[0] = input.nextInt();
        // marks[1] = input.nextInt();
        // marks[2] = input.nextInt();

        // Output
        // System.out.println("Physics : " + marks[0]);
        // System.out.println("Math : " + marks[1]);
        // System.out.println("Chemistry : " + marks[2]);
        // marks[2] = 100;
        // System.out.println("Chemistry : " + marks[2]);

        // System.out.println("Length of marks Array: " + marks.length);

        int marks2[] = { 97, 98, 99 };
        System.out.print("Before Update: ");
        for (int i = 0; i < marks2.length; i++) {
            System.out.print(marks2[i] + " ");
        }
        System.out.println();

        // After Update
        update(marks2);
        System.out.print("After Update: ");
        for (int i = 0; i < marks2.length; i++) {
            System.out.print(marks2[i] + " ");
        }
        System.out.println();
    }

    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i]++;
        }

    }
}
