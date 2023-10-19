public class maxSubArraySum {
    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        maxSubarraySum(numbers);
        minSubArraySumUsingPrefixArray(numbers);
        maxSubArraySumUsingKadenAlgorithm(numbers);
    }

    public static void maxSubarraySum(int numbers[]) {

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += numbers[k];

                }
                System.out.print(currSum + " ");
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
                System.out.println();
            }
        }
        System.out.println("Max sum in Sub Array is: " + maxSum);
    }

    public static void minSubArraySumUsingPrefixArray(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        // Calculating the Prefix Array
        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        //
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (currSum > maxSum) {
                    maxSum = currSum;
                }

            }
        }
        System.out.println("Max Sum using Prefix Array is " + maxSum);
    }

    public static void maxSubArraySumUsingKadenAlgorithm(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            currSum += numbers[i];
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }

        }
        System.out.println("Max Sum using Kaden Algorithm: " + maxSum);
    }
}
