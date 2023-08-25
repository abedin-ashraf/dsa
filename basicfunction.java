public class basicfunction {
    public static void main(String[] args) {
        printHelloWorld();
        System.out.println(multiply(10, 20));
        System.out.println("Factorial of 5 is " + factorial(5));
    }

    public static void printHelloWorld() {
        System.out.println("Hello World");
    }

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
