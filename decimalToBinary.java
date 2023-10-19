public class decimalToBinary {
    public static void main(String[] args) {
        System.out.println(decToBin(12));
    }

    public static int decToBin(int decNumber) {
        int binNumber = 0;
        int remainder = 0;
        int pow = 0;
        while (decNumber > 0) {
            remainder = decNumber % 2;
            binNumber = binNumber + remainder * (int) (Math.pow(10, pow));

            pow++;
            decNumber /= 2;
        }
        return binNumber;
    }
}