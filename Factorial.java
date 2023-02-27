package CWHarry01;

import java.util.Scanner;

public class Factorial {
    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter your given number:");
        number = input.nextInt();
        int factor = fact(number);
        System.out.println("Fact is :" + factor);
    }
}
