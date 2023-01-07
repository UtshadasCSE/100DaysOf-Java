package Exercise_1;

import java.util.Scanner;

public class ex04 {
//    Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
    public static void VoteEligible(int a){
        if (a>=18){
            System.out.println("You are Eligible for vote");
        }
        else if (a<=0){
            System.out.println("Get Lost MadarToast");
        }
        else {
            System.out.println("Aha! Grow up kid");
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        System.out.print("Age:");
        age=input.nextInt();
        VoteEligible(age);
    }
}
