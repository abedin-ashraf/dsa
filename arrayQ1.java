public class arrayQ1 {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1 };
        System.out.println(findDuplicate(nums));
        int nums2[] = { 1, 2, 3, 4 };
        System.out.println(findDuplicate(nums2));
        int nums3[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        System.out.println(findDuplicate(nums3));
    }

    public static boolean findDuplicate(int arr[]) {
        int currNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (currNum == arr[j]) {
                    return true;
                }
                currNum = arr[i];
            }
        }
        return false;

    }
}
