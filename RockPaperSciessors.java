package CWHarry01;

import java.util.Random;
import java.util.Scanner;

public class RockPaperSciessors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int userInput;
        int computerInput = random.nextInt(3);
        System.out.println("------------Enter your Choice------------\n0 for Rock\n1 for Paper \n2 for Scissors\n:");
        userInput = input.nextInt();
        if (userInput == computerInput) {
            System.out.println("Draw");
        } else if (userInput == 0 && computerInput == 2 || userInput == 2 && computerInput == 1
                || userInput == 1 && computerInput == 0) {
            System.out.println("You Win!!");
        } else {
            System.out.println("Computer Win!!");
        }
        System.out.println("Computer Choice is:" + computerInput);

    }

}
