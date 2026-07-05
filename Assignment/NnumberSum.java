package Assignment;
import java.util.Scanner;

public class NnumberSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        
        while (true) {
            System.out.print("Enter the number (or 'x' to stop): ");
            
            String input = in.next(); 
            
            
            if (input.equalsIgnoreCase("x")) {
                System.out.println("End of program");
                break;
            } else {
                try {
                    
                    int number = Integer.parseInt(input);
                    sum = sum + number;
                } catch (NumberFormatException e) {
                    
                    System.out.println("Invalid input! Please enter a valid number.");
                }
            }
        } 
        
        System.out.println("Sum of the Numbers: " + sum);
        in.close(); 
    }
}
