package java_program;
import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer day = in.nextInt();
        switch (day){
            case 1, 2, 3, 4 -> System.out.println("Weekday");
            case 5 -> System.out.println("Halfday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid day entered");
        }

        String name = in.next();
        switch (name){
            case "Ayush" -> System.out.println("The user name is Ayush");
            case "Harsh" -> System.out.println("The user name is Harsh");
            default -> System.out.println("Unknown user");
        }
        
        in.close();
    }
}
