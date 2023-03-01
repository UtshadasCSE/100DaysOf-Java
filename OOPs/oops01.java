package CWHarry01.OOPs;

class employee {
    int id;
    String name;

    public void printL() {
        System.out.println("My ID is :" + id);
        System.out.println("My name is :" + name);
    }
}

public class oops01 {
    public static void main(String[] args) {
        employee utsha = new employee();
        utsha.id = 3088;
        utsha.name = "Developer";
        utsha.printL();
    }
}
