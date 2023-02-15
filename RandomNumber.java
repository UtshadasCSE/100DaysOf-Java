package CWHarry01;

import java.util.Scanner;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100);
        float randomNumberF = rand.nextFloat(100.0f);
        System.out.println("Your integer random number:" + randomNumber);
        System.out.printf("Your Float random number: %.2f", randomNumberF);

    }
}
