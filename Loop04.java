package CWHarry01;

import java.util.Scanner;

public class Loop04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // for (int i = 1; i <= 10; i++) {
        // System.out.println(i);
        // }
        int number;
        System.out.println("Given Number:");
        number = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "X" + i + "=" + (number * i));
        }

    }
}
