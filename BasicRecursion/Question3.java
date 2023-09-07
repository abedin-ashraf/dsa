package BasicRecursion;

public class Question3 {
    public static void main(String[] args) {
        String str = "Ashraf";
        System.out.println(stringLength(str, 0));
        ;
    }

    static int count = 0;

    public static int stringLength(String str, int i) {
        // Base Case
        if (str.length() == i) {
            return count;
        }
        count++;
        return stringLength(str, i + 1);
    }
}
