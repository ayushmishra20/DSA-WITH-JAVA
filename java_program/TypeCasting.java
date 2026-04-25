package java_program;
import java.nio.channels.Pipe.SourceChannel;
import java.util.*;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // TypeCasting
        float num = (int) (123.43f);
        System.out.println(num);

        // Automatic TypeCasting By java
        int a = 257;
        byte b = (byte) (a);
        System.out.println(b);

        // TypeCasting by java
        byte r = 10;
        byte e = 20;
        byte t = 100;
        int d = r*e/t;
        System.out.println(d);

        // char in int TypeCasting will give ASCII Value
        int g = 'f';
        System.out.println(g);

        // Summary of TypeCasting is --> the highest value of the data type will be taken when it will appear 
        // ex -> double > int, int > byte 

        byte B = 2;
        char C = 'C';
        int I = 4;
        float F = 432.54f;
        short S = 3212;
        double D = 123456789;
        double result = (B*C) - (I*F) - (D*S);
        System.out.println((B*C) + " " + (I*F) +" " + (D*S));
        System.out.println(result);

        

        

    }
    
}
