import java.util.Scanner;

public class ZigzagConversion {

    public static String convert(String s, int numRows) {

        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];

        // Create StringBuilder for every row
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        // Put every character in its row
        for (char ch : s.toCharArray()) {

            rows[currentRow].append(ch);

            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            if (goingDown) {
                currentRow++;
            } else {
                currentRow--;
            }
        }

        // Join all rows
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            answer.append(rows[i]);
        }

        return answer.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String s = sc.nextLine();

        System.out.print("Enter Number of Rows: ");
        int numRows = sc.nextInt();

        String result = convert(s, numRows);

        System.out.println("Converted String = " + result);

        sc.close();
    }
}