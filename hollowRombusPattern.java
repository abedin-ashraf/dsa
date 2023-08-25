/*
 

    *****
   *   *
  *   *
 *   *
*****


 */

public class hollowRombusPattern {
    public static void main(String[] args) {

        hollowRombusPatternFunction(5);
    }

    public static void hollowRombusPatternFunction(int n) {
        // (n-i)* Space + if(i==1,j==1,i==n,j==n)-> * else -> " "
        for (int i = 1; i <= n; i++) {
            // (n-i)*Space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // if(i==1,j==1,i==n,j==n)-> * else -> " "
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
