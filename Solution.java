import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int nums1[] = { -1, 0, 0, 3, 3, 3, 0, 0, 0 };
        int m = 6;
        int nums2[] = { 1, 2, 2 };
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

        // int nums1[] = { 1, 2, 3, 0, 0, 0 };
        // int m = 3;
        // int nums2[] = { 2, 5, 6 };
        // int n = 3;
        // merge(nums1, m, nums2, n);
        // System.out.println(Arrays.toString(nums1));

        // int nums1[] = { 1 };
        // int m = 1;
        // int nums2[] = {};
        // int n = 0;
        // merge(nums1, m, nums2, n);
        // System.out.println(Arrays.toString(nums1));

        // int nums1[] = { 0 };
        // int m = 0;
        // int nums2[] = { 1 };
        // int n = 1;
        // merge(nums1, m, nums2, n);
        // System.out.println(Arrays.toString(nums1));

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int temp[] = new int[m + n];

        int i = m - 1;
        int j = n - 1;
        int k = nums1.length - 1;
        while (k >= 0) {
            if (i < 0 || (j >= 0 && nums2[j] > nums1[i])) {
                temp[k] = nums2[j];
                j--;
            } else {
                temp[k] = nums1[i];
                i--;
            }
            k--;
        }

        for (i = 0; i < temp.length; i++) {
            nums1[i] = nums1[i] ^ nums1[i] ^ temp[i];
        }

    }
}