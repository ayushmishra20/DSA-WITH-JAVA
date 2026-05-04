package java_program;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        one(2,3,4,5,6,4,44,67);
        multiple(2, 3, "Ayush", "to", "Meow");
    }
    static void one(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a , int b , String ...v){
    }
}
