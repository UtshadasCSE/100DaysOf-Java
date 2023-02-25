package CWHarry01;

import java.util.Scanner;

public class ArrayProblem07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int[] arr = new int[len];
        int max = 0;
        for (int i = 0; i < len; i++) {
            arr[i] = input.nextInt();
        }
        for (int e : arr) {
            System.out.print(e + "\t");
        }
        for (int m : arr) {
            if (m > max) {
                max = m;

            }
        }
        System.out.println("\n" + max);
    }
}
