package Assignment;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Entre your first Number : ");
        int n1 = in.nextInt();
        System.out.print("Entre your second number : ");
        int n2 = in.nextInt();
        in.close();

        int l1 = String.valueOf(n1).length();
        int l2 = String.valueOf(n2).length();

        if (l1>l2) {
            System.out.format("The first enterd Number is largest with length of : %d" , l1);
        }
        else if (l2>l1) {
            System.out.format("The first enterd Number is largest with length of : %d" , l2);
        }
        else if(l1 == l2){
            System.out.format("Both numbers are Equal length of : %d", l1);
        }
    }
}
