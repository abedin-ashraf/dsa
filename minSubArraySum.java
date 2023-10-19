public class minSubArraySum {
    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        minSubarraySum(numbers);

    }

    public static void minSubarraySum(int numbers[]) {
        int minSum = Integer.MAX_VALUE;
        int currSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += numbers[k];
                }
                if (currSum < minSum) {
                    minSum = currSum;
                }
            }
        }
        System.out.println("Minimum sum in Sub Array is: " + minSum);
    }

}
