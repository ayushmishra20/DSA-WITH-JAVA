package java_program;
import java.util.*;

public class Conditional {
    public static void main(String[] args){
        System.out.println("Making notes on Condionals");

        // if Condition
        int salary = 70000;
        if (salary>10000){
            System.out.printf("The acutual Sallary is : %d" , salary+20000);
        }else{
            System.out.println("No increment");
        }
        System.out.println("\n");

        // Nested If else
        int peaople = 2000;
        if (peaople >300){
            System.out.println("There is Overcrowed in the middel");
        }else if (peaople>10000) {
             System.out.println("There is no any such Crowed");
        }

    }
}