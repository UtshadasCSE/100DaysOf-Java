package CWHarry01.OOPs;

class car {
    private int series;
    private String brand;

    public String getName() {
        return brand;
    }

    public void setName(String n) {
        brand = n;
    }

    public int setID(int i) {
        return series = i;
    }

    public int getID() {
        return series;
    }

}

public class oops04 {
    public static void main(String[] args) {
        car model = new car();
        model.setName("BMW");
        System.out.println(model.getName());
        model.setID(3);
        System.out.println(model.getID());

    }
}
