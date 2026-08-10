


import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {344,43,-5,-678,0,123,45,6,7,8,9};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void bubble(int[] arr){
        // run the steps n-1 times
        for(int i = 0; i < arr.length - 1; i++){
            boolean swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than previous one
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if no swaps in this pass, array is sorted
            if (!swapped) {
                break;
            }
        }
    }

    
}
