package CWHarry01;

import java.util.Scanner;

public class findString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("Enter your name:");
        name = input.nextLine();
        System.out.println("Finding Char:");
        char ch = input.next().charAt(0);
        int findIndex = name.indexOf(ch);
        System.out.println(findIndex);

    }
}
