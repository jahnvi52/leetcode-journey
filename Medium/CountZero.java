import java.util.*;

public class CountZero {

    public static int countZeroSumSubarrays(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int prefixSum = 0;
        int count = 0;

        // Prefix sum 0 occurs once before the array starts
        map.put(0, 1);

        for (int num : nums) {

            prefixSum += num;

            if (map.containsKey(prefixSum)) {
                count += map.get(prefixSum);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = countZeroSumSubarrays(nums);

        System.out.println("Number of zero-sum subarrays = " + result);

        sc.close();
    }
}