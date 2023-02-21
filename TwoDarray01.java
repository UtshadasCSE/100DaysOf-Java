package CWHarry01;

public class TwoDarray01 {
    public static void main(String[] args) {
        int[][] arr;
        arr = new int[2][3];
        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[0][2] = 30;
        arr[1][0] = 30;
        arr[1][1] = 90;
        arr[1][2] = 70;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
