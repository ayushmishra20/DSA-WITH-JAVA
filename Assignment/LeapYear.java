package Assignment;

// Input a year and find whether it is a leap year or not.

import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        // Taking input 
        System.out.println("Enter Year : ");
        int year = in.nextInt();
        // Cheking condition 
        if (year % 4 == 0) {
            System.out.println("Enterd Year is leap year.");
        }else{
            System.out.println("Not A leap Year.");
        }
        in.close();
    }
}
