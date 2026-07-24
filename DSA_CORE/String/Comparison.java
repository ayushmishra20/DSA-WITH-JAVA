package DSA_CORE.String;

public class Comparison {
    public static void main(String[] args) {
        String a = "Ayush";
        // String b = "Mishra";
        String c = a;
        System.out.println(c == a); //true
        // ==

        String name1 = new String("Ayush");
        String name2 = new String("Ayush");

        System.out.println(name1 == name2); //false
        System.out.println(name1.equals(name2)); //true
    }
}
