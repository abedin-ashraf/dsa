package DivideAndConquer;

public class Question2BestSolution {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };

        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int arr[]) {
        return mojorityElementRec(arr, 0, arr.length - 1);
    }

    public static int mojorityElementRec(int[] arr, int lo, int hi) {
        // Base Case: the only element in an array of size 1 is the majority element
        if (lo == hi) {
            return arr[lo];
        }

        // Recurse on left and right halves of this slice
        int mid = lo + (hi - lo) / 2;
        int left = mojorityElementRec(arr, lo, mid);
        int right = mojorityElementRec(arr, mid + 1, hi);

        // If the two halves agree on the majority element, return it
        if (left == right) {
            return left;
        }

        // Otherwise, count each element and return the "winner"
        int leftCount = countInRange(arr, left, lo, hi);
        int rightCount = countInRange(arr, right, lo, hi);

        return leftCount > rightCount ? left : right;
    }

    public static int countInRange(int arr[], int num, int lo, int hi) {
        int count = 0;
        for (int i = lo; i <= hi; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        return count;
    }
}
