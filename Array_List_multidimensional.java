import java.util.ArrayList;
import java.util.Scanner;

public class Array_List_multidimensional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(2);

        System.out.println("Enter no elements : ");
        int n = input.nextInt();

        for (int i=0 ; i<n ; i++){
            for (int j=0 ; j<3 ; j++){
                System.out.println();
                list.get(i).add(input.nextInt()); //bu this way you can't do cos get(i) is having null
                /*so create individual array list objects and then add them*/
            }
        }
        System.out.println(list);
    }
}
