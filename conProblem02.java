package CWHarry01;

import java.util.Scanner;

public class conProblem02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int CG, CAO, WE;
        System.out.println("Computer Graphics marks:");
        CG = input.nextInt();
        System.out.println("Computer Archeticure and Organization marks:");
        CAO = input.nextInt();
        System.out.println("Web Engineering:");
        WE = input.nextInt();

        float avg = (CG + CAO + WE) / 3.0f;
        if (avg >= 40 && CG >= 33 && CAO >= 33 && WE >= 33) {
            System.out.println("OMG You are fill up pass requirment");
        } else {
            System.out.println("Better luck next time");
        }
    }
}
