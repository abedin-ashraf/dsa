package ArrayList;

import java.util.ArrayList;

public class ContainerWithMostWaterOptimizedSolution {
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(mostTrappedWater(height));
    }

    public static int mostTrappedWater(ArrayList<Integer> height) {
        int leftPointer = 0;
        int rightPointer = height.size() - 1;

        int maxWater = Integer.MIN_VALUE;

        while (leftPointer < rightPointer) {
            int trapedWater = Math.min(height.get(leftPointer), height.get(rightPointer))
                    * (rightPointer - leftPointer);
            maxWater = Math.max(maxWater, trapedWater);

            // Update Pointer
            if (leftPointer < rightPointer) { // Becauuse min_height matter in trapedWater
                leftPointer++;
            } else {
                rightPointer--;
            }
        }

        return maxWater;
    }
}
