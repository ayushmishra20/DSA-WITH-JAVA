package java_program;
import java.util.*;
public class ChangeValue {
    public static void main(String[] args) {
        // create an array

        int [] arr = {1, 2, 4, 56, 65};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 99; // if u change make a change to this object via this ref variable , same obj will be changed
    }
}
