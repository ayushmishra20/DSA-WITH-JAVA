package java_program;
import java.util.*;

public class Greeting {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
    //    greeting(in);
    //    in.close();

    String message = greetings(in);
    System.out.println(message);
    in.close();
    
    }
// yha pr return type void h kyunki hme kuch nhi chahiye

    static void greeting(Scanner in){
        String name = in.next();
        System.out.println("Hello Mr "+ name);
    }

    static String greetings(Scanner in){
        String name = in.next();
        String greet = "Hello Mr "+ name ;
        return greet;

    }
}
