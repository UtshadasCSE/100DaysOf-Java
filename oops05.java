package CWHarry01.OOPs;

class Empl {
    int id;
    String name;

    public Empl(int myId, String myName) {
        id = myId;
        name = myName;
    }

    public String getName() {
        return name;

    }

    public void setName(String n) {
        this.name = n;

    }

    public int getID() {
        return id;
    }

    public void setID(int i) {
        this.id = i;
    }

}

public class oops05 {
    public static void main(String[] args) {
        Empl one = new Empl(201, "UTSHA");
        System.out.println(one.getID());
        System.out.println(one.getName());

    }

}
