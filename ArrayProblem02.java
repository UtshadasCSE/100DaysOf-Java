package CWHarry01;

import java.util.Scanner;

public class ArrayProblem02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Len;
        System.out.print("Enter Array Length:");
        Len = input.nextInt();
        int[] number = new int[Len];
        int sum = 0;

        for (int i = 0; i < Len; i++) {
            number[i] = input.nextInt();
            sum += number[i];

        }
        System.out.println("Sum of GIven Numbers:" + sum);

    }
}
