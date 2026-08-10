package Array;

import java.util.Scanner;
import java.util.Arrays;



public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.printf("The index value is "+ arr[0]);

        System.out.println();

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }

        for(int num : arr) { // for every element in array, print the element
//            System.out.print(num + " "); //  here num represents element of the array
        }
//        System.out.println(arr[5]);// index out of bound error

        // Array of Objects
        String[] name = new String[4];
        for( int i = 0; i <name.length;i++){
            name[i] = in.next();
        }
        System.out.println(Arrays.toString(name));

        // Modify
        name[1] = "Ayush";
        System.out.println(Arrays.toString(name));
        in.close();
    }
}
