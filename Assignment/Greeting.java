package Assignment;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Entre your name : ");
        String name = in.next();
        System.out.println("Welcome , have a nice day: " + name);
        System.out.format("Welcome Mr %s , Have A very nice day.", name);
    }
}
