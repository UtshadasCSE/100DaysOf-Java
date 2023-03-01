package CWHarry01.OOPs;

class Employee3 {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class opps02 {
    public static void main(String[] args) {
        Employee3 utsha = new Employee3();
        utsha.setName("DJ");
        utsha.salary = 2000;
        System.out.println(utsha.getSalary());
        System.out.println(utsha.getName());

    }

}
