package Exercise_1;

import java.util.Scanner;

public class ex03 {
//    Write a function which takes in 2 numbers and returns the greater of those two.
    public static int GreaterNumber(int a,int b){
        if (a>b){
            return a;
        }
        else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println(GreaterNumber(a,b));
    }
}
