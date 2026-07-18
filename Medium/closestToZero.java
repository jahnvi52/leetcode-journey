import java.util.Arrays;

public class closestToZero {

    public static void findPair(int[] arr) {

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        int minSum = Integer.MAX_VALUE;
        int first = 0, second = 0;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (Math.abs(sum) < Math.abs(minSum)) {
                minSum = sum;
                first = arr[left];
                second = arr[right];
            }

            if (sum < 0)
                left++;
            else
                right--;
        }

        System.out.println("Pair: " + first + " " + second);
        System.out.println("Sum = " + minSum);
    }

    public static void main(String[] args) {

        int arr[] = {1, 60, -10, 70, -80, 85};

        findPair(arr);
    }
}