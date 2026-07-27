package Pattern;

public class Pattern {

    public static void main(String[] args){
        pattern3(5);
    }

    static void pattern1(int n){
        for (int row = 0; row < n; row++) {
            // for every row run the col
            for (int col = 0; col <= n; col++) {
                System.out.print("* ");
            }
            //print new line 
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }

    }
    static void pattern3(int n ){
        for (int row = 0; row < n; row++) {
            //print for col 
            for (int j = 0; j < n-row+1; j++) {
                System.out.println("* ");
            }
        }
    }
}