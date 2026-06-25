package DSA_CORE;

public class Arrays {
    public static void main(String[] args) {

    // Q: Store a intezer
    int a = 19;

    // Q: store a name
    String name = "Ayush Mishra";

    // Synntax 
    // datatype[] var_name = new dtype[size];
    // Store 5 Rol no
    int[] roll_no = new int[5];
    
    // or direcctly
    int[] roll_nos = {1,2,3,4,5};
    
    // int[] roll_nos ; // declearation of array roll_no is getting defined in the stack
    // roll_nos = new int[5]; // initialisation: actually here object is being created in the memory (heap)

    
    System.out.println(roll_nos[2]);


     String[] arr = new String[4];
        System.out.println(arr[0]);// null
    
    for (String element : arr) {
           System.out.println(element);
        }

    }
}
