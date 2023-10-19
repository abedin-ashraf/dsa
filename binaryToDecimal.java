public class binaryToDecimal {
    public static void main(String[] args) {
        System.out.println(binToDec(1010));
    }

    public static int binToDec(int binNumber) {
        int decNumber = 0;
        int pow = 0;
        int lastDigit = 0;

        while (binNumber > 0) {
            lastDigit = binNumber % 10;
            decNumber += lastDigit * Math.pow(2, pow);

            pow++;
            binNumber /= 10;
        }
        return decNumber;
    }
}
