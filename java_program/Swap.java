package java_program;

public class Swap {
    public static void main(String[] args) {
       /*int a = 10;
        int b = 20;
        int temp;

        temp = a;
        a = b;
        b = temp;
        System.out.println( a +" "+ b);*/

        String name = "Ayush Mishra..";
        swap(name);
        // System.out.println(name);

        // here we are not able to swap names in string bcoz we are creating new object not modifing it 
        // and in the array we are able to swap becoz there we will modify it not creating new obj

        Swap2(10,20);
        System.out.println();
    }
    static void Swap2( int a , int b){
        
        int temp = a;
        a = b;
        b = temp;

    }

    static String swap(String naam){
        naam = "Harsh Mishra..";
        return naam;
    }
}
