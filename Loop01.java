package CWHarry01;

import java.util.Scanner;

public class Loop01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Number For counting:");
        number = input.nextInt();
        for (int i = number; i <= 100; i++) {
            System.out.print(i + "\t");
        }
    }

}
