package CWHarry01;

import java.util.Arrays;

public class ArrayProblem01 {
    public static void main(String[] args) {
        int[] numeric = { 1, 7, 2, 4, 5, 3, 6, 12, 10, 9, 11 };
        String[] str = { "Hello", "Bangladesh", "Welcome", "To", "Our", "Project" };
        System.out.println("Orginal Array:" + Arrays.toString(numeric));
        Arrays.sort(numeric);
        System.out.println("Here is sort Format:" + Arrays.toString(numeric));
        System.out.println("Orginal Array of String:" + Arrays.toString(str));
        Arrays.sort(str);
        System.out.println("Sorten String Array:" + Arrays.toString(str));
    }
}
