package Assignment;

// Take a number as input and print the multiplication table for it.

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter number u want the Multiplication table of :");
        int num = in.nextInt();
        in.close();
        for(int i = 1; i <=10; i++){
            int Table = i * num;
            System.out.println(Table);
        }
        
    }
}
