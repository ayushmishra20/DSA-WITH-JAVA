package Assignment;

import java.util.Scanner;

public class PRT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("--- Simple Intrest Calculator ---");

        System.out.print("Entre Principle : ");
        double principle = in.nextDouble();

        System.out.print("Entre Time : ");
        double time = in.nextDouble();

        System.out.print("Entre Rate : ");
        double rate = in.nextDouble();

        System.out.println("---- Simple Intrest ----");
        double simpleintrest = (principle*time*rate)/100;
        System.out.format("Simple Intrest is : %.2f%n", simpleintrest);

        System.out.println("---- Total Ammount with Intrest ----");
        double total  = simpleintrest + principle;
        System.out.format("Total Ammout with Simple Intrest is %.2f%n", total);
    }
}
