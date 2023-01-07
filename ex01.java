package Exercise_1;

import java.util.Scanner;

public class ex01 {
//    Enter 3 numbers from the user & make a function to print their average.
    public static float Average(float a,float b,float c){
        return (a+b+c)/3;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a,b,c;
        a=input.nextFloat();
        b=input.nextFloat();
        c=input.nextFloat();
        System.out.println(Average(a,b,c));
    }
}
