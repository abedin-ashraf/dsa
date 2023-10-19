public class arrayQ5 {
    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };
        triplets(nums);

    }

    public static void triplets(int arr[]) {
        int n = arr.length;

        int ans[][] = new int[10][3];
        for (int i = 0; i < n - 2; i++) {
            for (int j = i; j < n - 2; j++) {
                if ((arr[i] + arr[i + 1] + arr[i + 2] == 0)
                        & ((arr[i] != arr[i + 1]) & (arr[i] != arr[i + 2] & (arr[i + 1] != arr[i + 2])))) {
                }
                System.out.println();
            }
        }
    }
}
