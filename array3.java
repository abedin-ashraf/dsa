public class array3 {
    public static void main(String[] args) {
        String Menu[] = { "rice", "potato", "cheese", "pizza" };
        String order = "potato";

        int index2 = LinearSearch(Menu, order);
        if (index2 == -1) {
            System.out.println("Not Found");

        } else {
            System.out.println("Order is at " + index2);
        }
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
