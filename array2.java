public class array2 {
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 20;

        int index = LinearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Not Found");

        } else {
            System.out.println("key is at " + index);
        }

        String Menu[] = { "rice", "potato", "cheese", "pizza" };
        String order = "potato";

        int index2 = LinearSearch(Menu, order);
        if (index2 == -1) {
            System.out.println("Not Found");

        } else {
            System.out.println("Order is at " + index);
        }
    }

    public static int LinearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (key == numbers[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int LinearSearch(String numbers[], String key) {
        for (int i = 0; i < numbers.length; i++) {
            if (key == numbers[i]) {
                return i;
            }
        }
        return -1;
    }
}
