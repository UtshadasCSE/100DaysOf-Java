package CWHarry01;

import java.util.Scanner;

public class ArrayProblem03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bond;
        System.out.print("Enter your array bond:");
        bond = input.nextInt();
        int[] number = new int[bond];

        // Input array from user
        for (int j = 0; j < number.length; j++) {
            System.out.printf("%d number:", j);
            number[j] = input.nextInt();
        }
        System.out.println("---------Reverse Array number---------");

        for (int i = number.length - 1; i >= 0; i--) {

            System.out.println(number[i]);
        }
    }
}
