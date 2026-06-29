package java_program;

import java.util.*;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // greeting(in);
        // in.close();

        /*
         * String message = greetings(in);
         * System.out.println(message);
         * in.close();
         */

        System.out.print("Enter your name: ");
        String person = in.next();
        String message = greet(person);
        System.out.println(message);

        in.close();

    }
    // Parameterized Strings

    static String greet(String name) {
        String greetingMessage = "How are u ?? " + name;
        return greetingMessage;
    }

    // yha pr return type void h kyunki hme kuch nhi chahiye

    static void greeting(Scanner in) {
        String name = in.next();
        System.out.println("Hello Mr " + name);
    }

    static String greetings(Scanner in) {
        String name = in.next();
        String greetingMessage = "Hello Mr " + name;
        return greetingMessage;

    }
}
