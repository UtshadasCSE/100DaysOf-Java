package CWHarry01;

import java.util.Scanner;

public class ArrayProblem05 {
    public static void main(String[] args) {
        int[][] add1 = { { 1, 3, 6 }, { 2, 4, 9 } };

        int[][] add2 = { { 7, 11, 5 },
                { 2, 4, 7 } };
        int[][] result = { { 0, 0, 0 },
                { 0, 0, 0 } };

        for (int i = 0; i < add1.length; i++) {
            for (int j = 0; j < add1[i].length; j++) {
                result[i][j] = add1[i][j] + add2[i][j];
                System.out.print(result[i][j]);
                System.out.print("\t");

            }
            System.out.println();
        }

    }
}
