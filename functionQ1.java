public class functionQ1 {
    public static void main(String[] args) {
        System.out.println(average(1, 2, 4));
        System.out.println(average(3.3f, 3.5f, 5.3f));
    }

    // Function to calculate the average of three numbers
    public static float average(int a, int b, int c) {
        float average = (float) (a + b + c) / 3;
        return average;
    }

    public static float average(float a, float b, float c) {
        float average = (a + b + c) / 3;
        return average;
    }
}
