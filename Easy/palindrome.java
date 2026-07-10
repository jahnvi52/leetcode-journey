import java.util.Scanner;

public class palindrome {

    static boolean checkPalindrome(char[] s, int left, int right) {

        if (left >= right)
            return true;

        if (s[left] != s[right])
            return false;

        return checkPalindrome(s, left + 1, right - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char[] s = str.toCharArray();

        boolean ans = checkPalindrome(s, 0, s.length - 1);

        System.out.println(ans);

        sc.close();
    }
}