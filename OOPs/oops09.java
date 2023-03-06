package CWHarry01.OOPs;

class WowSkin {
    int a;

    WowSkin() {
        System.out.println("I am a wow-skin constactor");
    }

    WowSkin(int a) {
        System.out.println("i am with value " + a);
    }
}

class minO extends WowSkin {
    int x;

    minO() {
        super(0);
    }
}

public class oops09 {
    public static void main(String[] args) {
        WowSkin cerum = new WowSkin();
        minO hair = new minO();

    }

}
