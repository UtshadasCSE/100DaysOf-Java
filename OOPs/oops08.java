package CWHarry01.OOPs;

class Phone {
    int width, height;

    public void PrintSome() {
        System.out.println("Hello Phone class");
    }
}

class Pixel extends Phone {

}

public class oops08 {
    public static void main(String[] args) {
        Phone my = new Phone();
        Pixel my2 = new Pixel();
        int b = my.width = 120;
        int c = my2.width = 100;
        System.out.println(b + "   " + c);

    }

}
