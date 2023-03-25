public class Q3_max_range {
    public static void main(String[] args) {
        int[] test_arr={12,0,45,100,1000,1};
        System.out.println(maxRange(test_arr, 1, 3));
    }

    static int maxRange(int[] arr, int start_index, int end_index){
        if (start_index>end_index){
            return -1;
        }
        if(arr==null){
            return -1;
        }

        int max=arr[0];
        for (int i=start_index ; i<=end_index ; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}