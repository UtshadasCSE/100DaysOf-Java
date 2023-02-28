package CWHarry01;

import java.util.Scanner;

public class MethodProblem01 {
    static void multiTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", n, i, (n * i));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Number for multiplication Table:");
        number = input.nextInt();
        multiTable(number);

    }
}
