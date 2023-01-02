package JavaPlacement;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
          Scanner input= new Scanner(System.in);
          int button;
          button=input.nextInt();
          switch (button){
              case 1:
                  System.out.println("Hello");
                  break;

              case 2:
                  System.out.println("Namaste");
                  break;
              case 3:
                  System.out.println("Salam");
                  break;
              default:
                  System.out.println("Invalid Number");
          }
//          button=input.nextInt();
//          if (button==1){
//              System.out.println("Hello");
//          }
//          else if (button==2){
//              System.out.println("Namaste");
//          } else if (button==3) {
//              System.out.println("Salam");
//
//          }
//          else {
//              System.out.println("Invalid Number");
//          }
//          int a,b;
//        System.out.println("Enter a and b:");
//        a=input.nextInt();
//        b=input.nextInt();
//        if (a==b){
//            System.out.println("Same number");
//        }
//        else if (a>b){
//            System.out.println(a+" is greater than "+b);
//        }
//        else {
//            System.out.println("B is greater than A");
//        }
//          int number;
//          System.out.print("Enter your number:");
//          number=input.nextInt();
//          if (number%2==0){
//              System.out.println("This is even number");
//          }
//          else {
//              System.out.println("This is odd number");
//          }
//        int age;
//        System.out.print("Enter your age:");
//        age=input.nextInt();
//        if (age>=18){
//            System.out.println("You are eligible for 18+ content");
//        }
//        else {
//            System.out.println("Hey kid just run away from this type of content");
//        }

//

    }
}
