package Assignment;

import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Entre  your Two numbers ");
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.print("Entre operator for calculation :");
        String operator = in.next();

        if (operator.equals("+")) {
            System.out.println("You Selected Plus operation, Ans is : "+ (a+b));            
        }
        if (operator.equals("-")) {
            System.out.println("You Selected Substraction operation, Ans is : "+ (a-b));            
        }
        if (operator.equals("*")) {
            System.out.println("You Selected Multiplication operation, Ans is : "+ (a*b));            
        }
        if (operator.equals("/")) {
            System.out.println("You Selected Devision operation, Ans is : "+ (a/b));            
        }
        
        
    }
}
