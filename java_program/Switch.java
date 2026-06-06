package java_program;
import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer day = in.nextInt();
        switch (day){
            case 1 -> System.out.println("Weekday");
            case 2 -> System.out.println("Weekday");
            case 3 -> System.out.println("Weekday");
            case 4 -> System.out.println("Weekday");
            case 5 -> System.out.println("Halfday");
            case 6 -> System.out.println("Weekend");
            case 7 -> System.out.println("Weekend");

        }

    }
}
