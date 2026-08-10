import java.util.Arrays;

public class Insetrion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,-12,0,-4,-1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr ){
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    static void swap( int[] arr , int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
// Sorting stability refers to what happens when an algorithm sorts elements that have equal sorting keys (duplicate values).

// Stable sorting guarantees that equal elements will retain their original relative order after being sorted.

// Unstable sorting makes no such guarantee; the relative order of equal elements might be scrambled during the sorting process.

// Bubble sort is a simple comparison-based sorting algorithm. It works by repeatedly stepping through a list, comparing adjacent elements, and swapping them if they are in the wrong order.

// The algorithm gets its name because the largest elements "bubble" up to the end of the array with each complete pass, much like air bubbles rising to the surface of water.