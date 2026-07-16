package Assignment;

import java.util.Scanner;

public class Odd_even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number To check for Odd/Even?");
        int a = in.nextInt();
        in.close();
        if (a%2 == 0) {
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd.");
        }
    }
}
