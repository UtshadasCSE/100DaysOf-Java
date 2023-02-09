package StringReverse;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String Given_str, rev_str = "";
        char split_ch;
        System.out.println("Given String:");
        Given_str = inp.nextLine();
        System.out.println("Orginal String:" + Given_str);
        for (int i = 0; i < Given_str.length(); i++) {
            split_ch = Given_str.charAt(i);
            rev_str = split_ch + rev_str;
        }
        System.out.println("String Revere:" + rev_str);

    }
}
