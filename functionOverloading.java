public class functionOverloading {
    public static void main(String[] args) {
        System.out.println(sum(10, 11));
        System.out.println(sum(4.8f, 10.6f));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // function to calculate float parameter
    public static float sum(float a, float b) {
        return a + b;
    }
}
