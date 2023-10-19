package BasicRecursion;

public class OptimizedPow {
    public static void main(String[] args) {
        System.out.println(optimizedPow(2, 5));
    }

    public static int optimizedPow(int x, int n){
        if(n==0){
            return 1;
        }
        int halfPow = optimizedPow(x, n/2);
        int halfPowSq = halfPow * halfPow;

        if(n%2 != 0){
            halfPowSq = x * halfPowSq;
        }

        return halfPowSq;

    }
}
