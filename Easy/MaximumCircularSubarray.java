import java.util.Scanner;

public class MaximumCircularSubarray {

    public static int maxSubarraySumCircular(int[] nums) {

        int total = 0;

        int currMax = 0;
        int maxSum = nums[0];

        int currMin = 0;
        int minSum = nums[0];

        for (int num : nums) {

            // Maximum Subarray Sum (Kadane)
            currMax = Math.max(num, currMax + num);
            maxSum = Math.max(maxSum, currMax);

            // Minimum Subarray Sum
            currMin = Math.min(num, currMin + num);
            minSum = Math.min(minSum, currMin);

            // Total Sum
            total += num;
        }

        // If all elements are negative
        if (maxSum < 0) {
            return maxSum;
        }

        // Maximum of normal and circular subarray
        return Math.max(maxSum, total - minSum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(maxSubarraySumCircular(nums));

        sc.close();
    }
}