package BitManipulation;

public class Q4 {
    public static void main(String[] args) {
        char a = 'A';
        char b = (char) (a | ' ');
        System.out.println(b);

        char d = 'c';
        char c = (char) (d & ~' ');
        System.out.println(c);

        System.out.println(2 & (-2));
        System.out.println(2 ^ 1);
    }
}
