package CWHarry01.OOPs;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import SimpleResume.resume;

class Game {
    int number, inputNumber, numberOfGusses = 0;

    public int getNumberGusses(int n) {
        return numberOfGusses;
    }

    public void SetNumberGusses(int numberOfGusses) {
        this.numberOfGusses = numberOfGusses;

    }

    void Game() {
        Random random = new Random();
        this.number = random.nextInt(100);
    }

    void takeUserInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Guess a Number:");
        inputNumber = input.nextInt();
    }

    boolean isCorrectNumber() {
        numberOfGusses++;
        if (inputNumber == number) {
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number,
                    numberOfGusses);
            return true;
        } else if (inputNumber < number) {
            System.out.println("Too low...");
        } else if (inputNumber > number) {
            System.out.println("Too high...");
        }
        return false;
    }
}

public class NumberGuess {
    public static void main(String[] args) {
        Game play = new Game();
        boolean b = false;
        while (!b) {
            play.takeUserInput();
            b = play.isCorrectNumber();
        }

    }

}
