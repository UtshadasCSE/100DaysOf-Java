package SimpleResume;

import java.util.Scanner;

public class resume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, email, phone, address, title, summaryStatement;
        System.out.println("Enter your full name:");
        name = sc.nextLine();
        System.out.println("Enter your email:");
        email = sc.nextLine();
        System.out.println("Enter your phone number:");
        phone = sc.nextLine();
        System.out.println("your address:");
        address = sc.nextLine();
        System.out.println("Education Title:");
        title = sc.nextLine();
        System.out.println("Tell about you:");
        summaryStatement = sc.nextLine();
        System.out.println("---------Resume---------");
        System.out.println();
        System.out.println("" + name);
        System.out.println("" + email);
        System.out.println("" + phone);
        System.out.println("" + address);
        System.out.println("" + title);
        System.out.println("" + summaryStatement);

    }
}
