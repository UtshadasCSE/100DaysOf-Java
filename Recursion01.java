package CWHarry01;

import java.util.Scanner;

public class Recursion01 {
    static void Rec(int n) {
        if (n < 1) {
            return;
        } else {
            System.out.format("%d", n);
            Rec(n - 1);
            System.out.format("%d", n);
            return;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        number = input.nextInt();
        Rec(number);

    }
}
