package CWHarry01;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        System.out.println("Enter your age:");
        age = input.nextInt();
        switch (age) {
            case 18:
                System.out.println("You are 18 years old");
                break;
            case 19:
                System.out.println("You are 19 years old");
                break;
            case 21:
                System.out.println("Perfect age for marriage");
                break;
            default:
                System.out.println("Take a chill pill");
        }
        System.out.println("Age is beautiful thing grew up and explore your future");

    }
}
