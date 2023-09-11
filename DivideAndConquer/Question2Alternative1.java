package DivideAndConquer;

public class Question2Alternative1 {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };

        System.out.println(func(arr));
    }

    public static int func(int arr[]) {
        int majorityCount = 0;
        int majorityCountIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > majorityCount) {
                majorityCount = count;
                majorityCountIndex = i;
            }
        }
        return arr[majorityCountIndex];
    }
}
