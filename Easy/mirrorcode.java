import java.util.Scanner;

public class mirrorcode {

    static String reverse(String str) {

        // Base case
        if (str.length() == 0)
            return "";

        // Recursive case
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(reverse(str));

        sc.close();
    }
}