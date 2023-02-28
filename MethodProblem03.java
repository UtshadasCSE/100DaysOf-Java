package CWHarry01;

import java.util.Scanner;

public class MethodProblem03 {

    static int sumRec(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumRec(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Sum:");
        num = in.nextInt();
        System.out.println(sumRec(num));

    }
}
