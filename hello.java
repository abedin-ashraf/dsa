import java.math.BigInteger;

public class hello {
    public static void main(String[] args) {
        // System.out.println(PowMod(282538755, 244836246, 757161423));
        // int arr[] = countBits(5);
        // System.out.println(countBits(5));
        // for (int i : arr) {
        // System.out.print(i + " ");
        // }

        // System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        int arr[] = { 1, 2, 10, 5, 7 };
        System.out.println(canBeIncreasing(arr));
    }

    public static boolean canBeIncreasing(int[] nums) {
        int arr[] = new int[nums.length - 1];
        int count = 0;
        int index = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                count++;
                index = i;
            }
        }

        if (count > 1) {
            return false;
        } else {
            if (index == 0 || index == nums.length - 2) {
                return true;
            } else if (nums[index - 1] < nums[index + 1] || nums[index + 2] > nums[index]) {
                return true;
            } else {
                return false;
            }
        }

    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if ((int) s.charAt(i) >= 97 && (int) s.charAt(i) <= 122) {
                sb.append(s.charAt(i));
            }

        }
        System.out.println(sb);
        for (int i = 0; i < sb.length() / 2; i++) {
            if (sb.charAt(i) != sb.charAt(sb.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static long PowMod(long x, long n, long m) {
        // Code here
        long ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = (ans * x) % m;
                System.out.println("ans: " + ans);
            }
            x = (x * x) % m;
            System.out.println("x: " + x);
            n = n >> 1;
        }
        return ans;

    }

    public static int[] countBits(int n) {
        int countBits[] = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            int count = 0;
            int j = i;
            while (j > 0) {
                if ((j & 1) != 0) {
                    count++;
                }
                j = j >> 1;
            }
            countBits[i] = count;
        }
        return countBits;
    }

}