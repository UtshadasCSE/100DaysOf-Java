package CWHarry01;

import java.util.Scanner;

public class ArrayProblem04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len, findArray;
        boolean Find = false;

        System.out.println("Enter Length:");
        len = input.nextInt();
        int[] number = new int[len];
        for (int i = 0; i < number.length; i++) {
            System.out.println("Value");
            number[i] = input.nextInt();

        }
        System.out.println("Given Number:");
        findArray = input.nextInt();
        for (int j = 0; j < number.length; j++) {
            if (number[j] == findArray) {
                Find = true;
                System.out.println(Find);
            }
        }

    }
}
