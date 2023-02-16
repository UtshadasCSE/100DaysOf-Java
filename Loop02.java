package CWHarry01;

import java.util.Scanner;

public class Loop02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Number:");
        number = input.nextInt();
        while (number <= 100) {
            System.out.println(number);
            number++;
        }
    }
}
