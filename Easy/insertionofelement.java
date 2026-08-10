import java.util.Scanner;

public class insertionofelement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();

        int[] arr = new int[n + 1];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int pos, x;
        pos = sc.nextInt();
        x = sc.nextInt();

        // Shift elements to the right
        for (int i = n; i >= pos; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert element at 1-based position
        arr[pos - 1] = x;

        // Print updated array
        for (int i = 0; i <= n; i++) {
            if (i != n) {
                System.out.print(arr[i] + " ");
            } else {
                System.out.print(arr[i]);
            }
        }

        sc.close();
    }
}