//error
//need to resolve this
import java.util.*;

public class Array_2D_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no of rows = ");
        int n = input.nextInt();

        int[][] arr = new int[n][] ;

        for (int i =0 ; i<n ; i++){
            System.out.println("Enter no of columns in row "+ i+1);
            int size=input.nextInt();
            System.out.println("Enter elements of row "+i+1);
            for (int k=0 ; k<size ; k++) arr[i][k] = input.nextInt();
        }
//for output : size < arr[row].length to inculcate the idea of varying length
    }
}