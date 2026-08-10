package java_program;
import java.util.*;

public class Input {
    public static void main(String[] args){
        System.out.print("Enter your roll no...");
        Scanner input = new Scanner(System.in);
        input.close();
        int rollno = input.nextInt();
        System.out.println("Your roll no is " + rollno);
    }
    
}
