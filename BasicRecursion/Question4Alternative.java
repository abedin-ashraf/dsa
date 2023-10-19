package BasicRecursion;

public class Question4Alternative {
    public static void main(String[] args) {
        String str = "abca";
        int x = contiguousSubString(str, 0, str.length() - 1, str.length());
        System.out.println(x);
    }

    public static int contiguousSubString(String str, int i, int j, int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int res = contiguousSubString(str, i + 1, j, n - 1) + contiguousSubString(str, i, j - 1, n - 1)
                - contiguousSubString(str, i + 1, j - 1, n - 2);

        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }
        return res;

    }
}
