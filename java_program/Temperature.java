package java_program;
import java.util.*;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temp in Celcious: ");
        float tempC = input.nextFloat();
        input.close();

        float tempF = (tempC * 9/5) + 32;
        System.out.println("Temperature in forrenheight is : "+ tempF);
    }
    
}
