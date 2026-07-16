package Assignment;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();
        
        // Initialize the first two terms of the series
        int firstTerm = 0;
        int secondTerm = 1;
        
        System.out.println("Fibonacci Series up to " + n + " terms:");
        
        // Loop to generate and print the series
        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");
            
            // Calculate the next term by adding the previous two
            int nextTerm = firstTerm + secondTerm;
            
            // Update values for the next iteration
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        
        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}
