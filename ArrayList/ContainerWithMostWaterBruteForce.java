package ArrayList;

public class ContainerWithMostWaterBruteForce {
    public static void main(String[] args) {
        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(mostWater(height));
    }

    public static int mostWater(int height[]) {
        int maxWater = Integer.MIN_VALUE;

        // Brute Force
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int trapedWater = Math.min(height[i], height[j]) * (j - i);
                maxWater = Math.max(trapedWater, maxWater);
            }
        }
        return maxWater;
    }
}
