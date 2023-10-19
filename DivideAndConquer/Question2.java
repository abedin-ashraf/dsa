package DivideAndConquer;

import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };

        System.out.println(func(arr));
    }

    public static int func(int arr[]) {
        StringBuffer sb = new StringBuffer("");
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            sb.append(arr[i]);
            while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                count++;
                i++;
            }
            sb.append(count);
        }
        int big = 0;
        int bigIdx = 0;
        for (int i = 1; i < sb.length(); i += 2) {
            int x = Character.getNumericValue(sb.charAt(i));
            if (big < x) {
                big = x;
                bigIdx = i;
            }
        }
        return Character.getNumericValue(sb.charAt((bigIdx - 1)));
    }
}
