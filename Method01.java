package CWHarry01;

import java.util.Scanner;

public class Method01 {
    static void checkMax(int x, int y) {
        if (x > y) {
            System.out.println(x + " is greater than " + y);
        } else {
            System.out.println(y + " is greater than " + x);
        }
    }

    public static void main(String[] args) {
        Scanner inputt = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter number A:");
        num1 = inputt.nextInt();
        System.out.print("Enter number B:");
        num2 = inputt.nextInt();
        checkMax(num1, num2);

    }
}
