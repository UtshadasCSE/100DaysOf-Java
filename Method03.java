package CWHarry01;

public class Method03 {
    static void arrChange(int[] arr) {
        arr[0] = 40;
    }

    public static void main(String[] args) {
        int[] marks = { 90, 80, 50, 60 };
        arrChange(marks);
        System.out.println("After change:" + marks[0]);

    }
}
