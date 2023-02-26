package CWHarry01;

import java.util.Scanner;

public class Method04 {
    static void greetings() {
        System.out.println("Hello");
    }

    static void greetings(String name) {
        System.out.println("Hello," + name);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.print("What's your name:");
        name = input.nextLine();
        greetings(name);

    }
}
