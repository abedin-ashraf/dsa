public class trappedRainWater {
    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int trappedWater = trappedRainWater(height);
        System.out.println("Trapped Rain Water: " + trappedWater);

    }

    public static int trappedRainWater(int height[]) {
        int n = height.length;
        // Calculate left max boundary-array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // Calculate right max boundary-array
        int rigthMax[] = new int[n];
        rigthMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rigthMax[i] = Math.max(height[i], rigthMax[i + 1]);
        }
        // loop
        int trappedWater = 0;
        int waterLevel;
        for (int i = 0; i < n; i++) {
            // waterLevel = min(leftMax bound, rightMax bound)
            waterLevel = Math.min(leftMax[i], rigthMax[i]);
            // Trapped Water = waterLevel - height[i]
            trappedWater += waterLevel
                    - height[i];
        }
        return trappedWater;
    }
}
