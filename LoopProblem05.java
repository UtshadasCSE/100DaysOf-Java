package CWHarry01;

import java.util.Scanner;

public class LoopProblem05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, fact = 1;
        System.out.print("Given number:");
        number = input.nextInt();
        for (int i = number; i >= 1; i--) {
            fact *= i;

        }
        System.out.println("Factorial:" + fact);
    }
}
