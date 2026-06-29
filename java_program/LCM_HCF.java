package java_program;

import java.util.*;

public class LCM_HCF {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        
        int a = num1;
        int b = num2;

        while (b==0) {
            int remainder = a%b;
            a = b;
            b = remainder;

        }
        int HCF = a;

        int LCM = (num1 + num2)/ HCF;

        System.out.println("HCF is "+ HCF);
        System.out.println("LCM is "+ LCM);
    }
}
