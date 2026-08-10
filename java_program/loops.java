package java_program;

import java.util.*;

public class loops {
    public static void main(String[] args) {
        System.out.println("Printing the values using loops");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i);
        }

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (num = 0; num <= 20; num++) {
            System.out.println(num + " ");
        }
        input.close();

        // While loop
        // while (condition){
        // body
        // }

        int n = 1;
        while (n < 10) {
            System.out.println(n);
            n++;
        }

        // Do While loop
        int N = 1;
        do {
            System.out.println(N);
            n++;
        } while (N < 10);
    }
}
