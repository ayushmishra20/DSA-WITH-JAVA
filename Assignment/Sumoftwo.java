package Assignment;

// Take two numbers and print the sum of both.

import java.util.Scanner;

public class Sumoftwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the both numbers");
        int a = in.nextInt();
        int b = in.nextInt();

        int sum = (a+b);
        System.out.println("Sum of Two Numbers is : "+ sum);
        in.close();

    }
}
