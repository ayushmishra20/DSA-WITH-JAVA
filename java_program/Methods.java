package java_program;

import java.util.*;

public class Methods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Sum(in);
        /*
        int result = Sum2(in);
        System.out.println("The returned sum is: " + result);*/
        in.close();

        int result = Sum3(40, 50);
        System.out.println(result);


    }

// Parameterized Methods
    static int Sum3(int a, int b){
        int sum = a + b;
        return sum;
    }


// Return Type Matters for which dtype is executing and return kya aa rha hai
    static void Sum(Scanner in) {
        int a, b, sum;
        a = in.nextInt();
        b = in.nextInt();
        sum = a + b;
        System.out.println(sum);
    }
    static int Sum2(Scanner in){
        System.out.println("Enter the first number");
        int a = in.nextInt();
        System.out.println("Enter the second number");
        int b = in.nextInt();
        int sum = a + b;
        return sum;
    }
}
