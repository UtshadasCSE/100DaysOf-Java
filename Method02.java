package CWHarry01;

import java.util.Scanner;

public class Method02 {
    static void EvenOdd(int x, int y, int z) {
        if (x % 2 == 0 || y % 2 == 0 || z % 2 == 0) {
            System.out.println("It's a Even Number");
        } else {
            System.out.println("It's a odd Number");
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Numer a:");
        num1 = input.nextInt();
        System.out.print("Number b:");
        num2 = input.nextInt();
        System.out.print("Number c:");
        num3 = input.nextInt();
        EvenOdd(num1, num2, num3);

    }
}
