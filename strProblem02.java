package CWHarry01;

import java.util.Scanner;

public class strProblem02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String GivenString;
        System.out.println("Your string:");
        GivenString = input.nextLine();
        System.out.println("Here is your orginal String:" + GivenString);
        String repl = GivenString.replace(" ", "_");
        System.out.println("After:" + repl);
    }
}
