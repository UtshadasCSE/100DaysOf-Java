package CWHarry01;

import java.util.Scanner;

public class Array01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("How many number do you need:");
        number = input.nextInt();

        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.print(i + "is:");
            array[i] = input.nextInt();

        }
        System.out.println("Here is your Number:");
        for (int j = 0; j < number; j++) {
            System.out.print(array[j] + "\t");
        }
    }

}
