package CWHarry01;

public class ArrayProblem06 {

    static void reverse(int arr[], int n) {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = arr[i];
            j = j - 1;
        }
        for (int k = 0; k < n; k++) {
            System.out.print(b[k]);
            System.out.print(" \t");
        }

    }

    public static void main(String[] args) {
        int[] number = { 1, 2, 3, 4, 5, 6 };
        reverse(number, number.length);

    }
}
