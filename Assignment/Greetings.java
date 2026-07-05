package Assignment;
// Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class Greetings {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String greet = Greet("Ayush");
        System.out.println(greet);
        
        in.close(); 
    }
    static String Greet(String name){
        return "Hello , have a good day..."+ name;
    }
}
