import java.util.*;

public class Array_input {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("enter size of array=");
        n=input.nextInt();
        int[] arr = new int[n];

        //input of elements from users
        System.out.println("Enter elements of array : ");
        for (int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }

        //1. printing array using for loop
        System.out.println("Array given by user : ");
        for (int j=0;j< arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        //2. other way of printing array members
        //using enhanced for
        System.out.println("\n\nUsing enhanced for \nArray given by user : ");
        for(int member : arr){
            System.out.print(member+" ");
        }
        //3. using toString method of Arrays class : Best way
        System.out.println("\nusing toString method : ");
        System.out.println(Arrays.toString(arr));
    }
}