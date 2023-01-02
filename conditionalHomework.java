package JavaPlacement;

import java.util.Scanner;

public class conditionalHomework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b;
        char operator;
        System.out.println("Enter number1:");
        a=input.nextDouble();
        System.out.println("Enter number2:");
        b=input.nextDouble();
        System.out.println("Operator :+,-,*,/");
        operator=input.next().charAt(0);
        switch (operator){
            case '+':
                System.out.println(a+"+"+b+"="+(a+b));
                break;
            case '-':
                System.out.println(a+" - "+b+" = "+(a-b));
                break;
            case '*':
                System.out.println(a+" * "+b+" = "+(a*b));
                break;
            case '/':
                System.out.println(a+" / "+b+" = "+(a/b));
                break;
            default:
                System.out.println("Invalid operator");
        }

    }
}
