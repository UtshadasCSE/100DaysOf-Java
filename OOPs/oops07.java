package CWHarry01.OOPs;

class CyMath {
    private int radius, height;

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

    public double SufaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

}

public class oops07 {
    public static void main(String[] args) {
        CyMath area = new CyMath();
        area.setRadius(12);
        area.setHeight(20);
        System.out.println(area.SufaceArea());

    }
}
