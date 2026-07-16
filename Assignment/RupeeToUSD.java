package Assignment;

import java.util.Scanner;

public class RupeeToUSD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Ammout u want to convert in USD");
        int rupee = in.nextInt();

        in.close();
        System.out.println("Value in usd is : "+ (rupee/96.34));

    }
}
