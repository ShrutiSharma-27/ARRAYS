import java.util.Arrays;

public class Array_2D {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
        //printing 2d array
        for (int i=0 ; i<3 ; i++){
            for (int j=0 ; j<3 ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();//redirect to next line, as if i'm using \n it is leaving 1 line
        }

        //can also have array with varying columns
        int[][] arr1 = new int[3][]; //ex1

        //also called DYNAMIC ARRAYS
        int[][] arr2 = {{1,2}, //ex2
                {3,4,5},
                {6,7,8,9}};

        //normal for

        //enhanced for loop
        System.out.println("using enhanced for loop");
        for (int[] member : arr2) System.out.println(Arrays.toString(member));

    }
}
