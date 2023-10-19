package BasicRecursion;

public class FriendsPairing {
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }

    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        // Single
        int fnm1 = friendsPairing(n - 1);

        // Pair
        int fnm2 = friendsPairing(n - 2);
        int pairWays = (n - 1) * fnm2;

        // totalWays
        int totalways = pairWays + fnm1;

        return totalways;
    }
}
