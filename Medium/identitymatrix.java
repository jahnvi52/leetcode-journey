

import java.util.Scanner;

public class identitymatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        if (rows != cols) {
            System.out.println("Not Identity Matrix");
            sc.close();
            return;
        }

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean isIdentity = true;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (i == j) {

                    if (matrix[i][j] != 1) {
                        isIdentity = false;
                        break;
                    }

                } else {

                    if (matrix[i][j] != 0) {
                        isIdentity = false;
                        break;
                    }

                }
            }

            if (!isIdentity) {
                break;
            }
        }

        if (isIdentity) {
            System.out.println("Identity Matrix");
        } else {
            System.out.println("Not Identity Matrix");
        }

        sc.close();
    }
}