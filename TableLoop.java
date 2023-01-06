package JavaPlacement;

import java.util.Scanner;

public class TableLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        a=input.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(a+"X"+i+"="+(a*i));
        }
    }
}
