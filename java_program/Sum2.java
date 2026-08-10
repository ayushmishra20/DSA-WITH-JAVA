package java_program;

import java.util.*;

public class Sum2 {
    public static void main(String[] args) {
        // int ans = Sum2;

        // Addition();
        // greetings();
        // int result = summition(10, 10);
        // System.out.println(result);
        // String message = greet();
        // System.out.println(message);
        Scanner in = new Scanner(System.in);
        String name = in.next();
        in.close();
        String personalised = mygreet(name);
        System.out.println(personalised);
    }

    // Return type int Method
    static int Addition() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number 1: ");
        int a = in.nextInt();
        System.out.println("Enter Second number 2: ");
        int b = in.nextInt();
        int add = a + b;
        in.close();
        System.out.println(add);
        return add;
    }

    // String greet
    static String mygreet( String name){
        String message = "Hello Mr. "+ name;
        return message;
    }

    // Greeting Method
    static void greetings() {
        System.out.println("Hello Ayush...");
    }

    // Retur type int method
    static int summition(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // Return Type String
    static String greet(){
        String greeting = "Hello Ayush..";
        return greeting;
    }



}
