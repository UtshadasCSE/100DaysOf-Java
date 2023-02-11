package CWHarry01;

public class strMethoid01 {
    public static void main(String[] args) {
        String name = "Utsha";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        String str = "            This is am example of trim";
        System.out.println(str.trim());
        System.out.println(name.substring(2, 3));
        System.out.println(name.replace('t', 'b'));
        System.out.println(name.replace("tsh", "lcd"));
        String ex = "Hello";
        System.out.println(ex.startsWith("h"));
        System.out.println(ex.charAt(0));
        System.out.println(ex.equals("Hello"));
        System.out.println(ex.equalsIgnoreCase("Hello"));
        System.out.println("Hello i am utsha \" and you");
    }

}
