package Exercise_1;

import java.util.Scanner;

public class ex02 {
//    Write a function to print the sum of all odd numbers from 1 to n
            public static int OddNumberSum(int a){
                int sum=0;
                for (int i=1;i<=a;i=i+2){
                    sum=sum+i;
                }
                return sum;

            }

    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                int number=input.nextInt();
                System.out.println(OddNumberSum(number));


    }

}
