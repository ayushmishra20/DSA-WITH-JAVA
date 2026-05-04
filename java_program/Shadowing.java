package java_program;

public class Shadowing {
    static int a = 10;
    public static void main(String[] args) {
        System.out.println(a); //10
        int a ;// declearing the var
        // System.out.println(a);// will provide eror bcoz The local variable a may not have been initialized, scope will begain when a is initialized
        a = 30; // intialising
        System.out.println(a);// the value of the a will be shadowd by the lower var to upper var
        fun();// shadowing does not work in methods

        
    }

    static void fun(){
        System.out.println(a);
    }
}
