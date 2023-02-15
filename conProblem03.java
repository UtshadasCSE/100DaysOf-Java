package CWHarry01;

import java.util.Scanner;

public class conProblem03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float income, tax = 0;
        System.out.println("Enter your Annual Salary:");
        income = input.nextFloat();
        if (income < 2.5) {
            tax = tax + 0;
        }
        if (income > 2.5f && income < 5.0f) {
            tax = tax + 0.05f * (income - 2.05f);
        } else if (income > 5.0f && income < 10.0f) {
            tax = tax + 0.2f * (income - 5.0f);
        }
        System.out.println("your Tax Fee :" + tax);
    }
}
