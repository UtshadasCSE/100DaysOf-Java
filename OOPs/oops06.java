package CWHarry01.OOPs;

class Cylinder {
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

public class oops06 {
    public static void main(String[] args) {
        Cylinder one = new Cylinder();
        one.setHeight(12);
        int height = one.getHeight();
        one.setRadius(123);
        int radius = one.getRadius();

        System.out.println(height);
        System.out.println(radius);
    }

}
