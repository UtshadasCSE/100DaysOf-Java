package CWHarry01.OOPs;

class Google {
    void ai() {
        System.out.println("bard");
    }
}

class Openai extends Google {
    void ai() {
        System.out.println("Chat GPT");
    }
}

public class oops11 {
    public static void main(String[] args) {
        Google bard = new Openai();
        bard.ai();
    }

}
