package CWHarry01.OOPs;

class Squre {
    int side;

    public int area() {
        return side * side;
    }

    public int para() {
        return 4 * side;
    }
}

public class opps03 {
    public static void main(String[] args) {

        Squre object = new Squre();
        object.side = 4;
        System.out.println(object.area());
        System.out.println(object.para());

    }
}
