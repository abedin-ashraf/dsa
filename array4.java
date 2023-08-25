public class array4 {
    public static void main(String[] args) {
        int numbers[] = { 1, 2, 4, 5, 355, 3, 5, 3, 23, 334, 2323, 5453, 542, 324 };

        int largest = findLargest(numbers);
        System.out.println("Largest Value in Array is " + largest);
    }

    public static int findLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity

        // Linear Search
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest in Array is " + smallest);
        return largest;
    }

}
