package CWHarry01;

import java.util.Scanner;

public class MethodProblem02 {
    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Number for pattern:");
        number = input.nextInt();
        pattern(number);

    }
}
