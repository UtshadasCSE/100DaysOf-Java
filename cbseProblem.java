package CWHarry01;

import java.util.Scanner;

/**
 * cbseProblem
 */
public class cbseProblem {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Compiler marks:");
        int compiler = Sc.nextInt();
        System.out.println("Enter Operating Marks:");
        int Operating = Sc.nextInt();
        System.out.println("Enter Computer Graphics marks:");
        int ComputerGrapichs = Sc.nextInt();
        System.out.println("Enter Web Engineering:");
        int webEngin = Sc.nextInt();
        float cgpa = ((compiler + Operating + ComputerGrapichs + webEngin) / 400.00f) * 100;
        System.out.println("Your CGPA :" + cgpa);

    }

}