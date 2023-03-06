package CWHarry01.OOPs;

class dog {
    void Speak() {
        System.out.println("Gwe Gwe Gwe....");
    }
}

class cat extends dog {
    @Override
    void Speak() {
        System.out.println("Mewo Mewo Mewo......");
    }
}

public class oops10 {
    public static void main(String[] args) {
        dog tommy = new dog();
        cat pussy = new cat();
        tommy.Speak();
        pussy.Speak();

    }
}
