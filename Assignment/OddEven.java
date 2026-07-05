package Assignment;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num %2 == 0) {
            System.out.println("Number is even.");
        }else{
            System.out.println("Number id Odd.");
        }
        in.close();
    }
}
