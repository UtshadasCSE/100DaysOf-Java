package JavaPlacement;

import java.util.Scanner;

public class Variable {
    public static void main(String[] args) {
        int a,b;
        a=901;
        b=20;
        String name;              //Primitive=(byte,int,long,double,float,double) and Non-primitive=(array,String,class,object,interface);
        boolean bol;
        double number;
        float number2;
        char ch='c';
        int sum=2*a; //here 2 is constant,Because 2 is not changeable
        System.out.println(ch);
        System.out.println(sum);
                     // a*b
        //Calculate =    -
                      //a-b

        int result=(a*b)/(a-b);
        System.out.println(result);

        String inName;
        Scanner input = new Scanner(System.in);
        inName=input.nextLine();
        System.out.println(inName);
        int number1,number3;
        System.out.println("Number1:");
        number1=input.nextInt();
        System.out.println("Number2:");
        number3=input.nextInt();
        int adding=number1+number3;
        System.out.println(adding);



    }
}
