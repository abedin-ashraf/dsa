import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int nums[] = { 3, 1 };
        System.out.println(search(nums, 1));
    }

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int pivot = nums[0];
        // if (high > pivot) {
        // if (pivot > target) {
        // low += pivot;
        // } else {
        // high -= pivot;
        // }
        // }

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            }
        }
        return -1;
    }
}