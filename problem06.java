package CWHarry01;

public class problem06 {
    public static void main(String[] args) {
        char grade = 'A';
        // encript
        grade = (char) (grade + 8);
        System.out.println("Grade is En: " + grade);
        // decript
        grade = (char) (grade - 8);
        System.out.println("Grade is Dec: " + grade);

    }
}
