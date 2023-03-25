import java.util.*;

public class Q4_reverse {
    public static void main(String[] args) {
        int[] test_arr={10,20,30,40,50};
        System.out.println("your array : "+Arrays.toString(test_arr));
        reverse(test_arr);
        System.out.println("your reverse array : "+Arrays.toString(test_arr));
    }

    static void reverse(int[] arr){
        //can use
        /*swap(arr, start, end)*/
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            //OR can use
            /*
            swap(arr, start, end)
            start++;end--;
            */
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++; end--;
        }
    }

}
