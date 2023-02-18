package CWHarry01;

import java.util.Scanner;

public class LoopProblem04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, sum = 0;
        System.out.println("Given number:");
        number = input.nextInt();
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of even number:" + sum);
    }
}
