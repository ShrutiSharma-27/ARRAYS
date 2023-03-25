import java.util.*;

public class Q1_swap {
    public static void main(String[] args) {
        int[] test_arr = {1,23,90,7,6,50};
        System.out.println("your array : "+ Arrays.toString(test_arr));
        swap(test_arr, 2,4);
        System.out.println("your array after swapping : "+Arrays.toString(test_arr));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
