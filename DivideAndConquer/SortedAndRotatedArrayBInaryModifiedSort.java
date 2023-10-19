package DivideAndConquer;

public class SortedAndRotatedArrayBInaryModifiedSort {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println(search(arr, target));
    }

    public static int search(int arr[], int tar) {
        int index = -1;
        int si = 0;
        int ei = arr.length - 1;

        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (arr[mid] == tar) {
                index = mid;
                break;
            } else if (arr[si] <= arr[mid]) { // On line 1
                if ((arr[si] <= tar && tar <= arr[mid])) {
                    ei = mid - 1;
                } else {
                    si = mid + 1;
                }
            }
        }
        return index;
    }

}
