package CWHarry01.OOPs;

import javax.crypto.Cipher;

class circle {
    public int radius;

    circle() {
        System.out.println("hello circle");
    }

    public double circle(int r) {
        return Math.PI * this.radius * this.radius;

    }
}

class cyln extends circle {
    int height;
}

abstract class parent {
    void child() {
        System.out.println("Hello");
    }

    abstract public void say();
}

class hello extends parent {
    public void say() {
        System.out.println("Kya hal chal hai bachhu");
    }
}

public class oops13 {
    public static void main(String[] args) {
        circle obj = new circle();
        hello objj = new hello();
        objj.say();

    }

}
