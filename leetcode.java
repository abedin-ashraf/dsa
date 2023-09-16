public class leetcode {
    public static void main(String[] args) {
        int nums[] = { 6, 6, 6, 7, 7 };

        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {

        int maxCount = 0;
        int majorityIndex = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                majorityIndex = i;
            }
        }
        return nums[majorityIndex];
    }
}
