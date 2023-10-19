public class javaQ4 {
    public static void main(String[] args) {
        int heights[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(rainwaterCollection(heights));

        int heights2[] = { 0, 4, 3, 2, 5, 3, 2, 5 };
        System.out.println(rainwaterCollection(heights2));

    }

    public static int rainwaterCollection(int heights[]) {
        int n = heights.length;
        // for max left side boundary
        int maxLeftBoundary[] = new int[n];
        maxLeftBoundary[0] = heights[0];
        for (int i = 1; i < n; i++) {
            maxLeftBoundary[i] = Math.max(heights[i], maxLeftBoundary[i - 1]);
        }

        // for max right side boundary
        int maxRightBoundary[] = new int[n];
        maxRightBoundary[n - 1] = heights[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxRightBoundary[i] = Math.max(heights[i], maxRightBoundary[i + 1]);
        }

        // for the trapped water
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int level = Math.min(maxLeftBoundary[i], maxRightBoundary[i]);
            int water = level - heights[i];
            trappedWater += water;
        }
        return trappedWater;
    }
}
