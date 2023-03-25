public class Q2_max {
    public static void main(String[] args) {
        int[] test_arr={12,0,45,100,1000,1};
        System.out.println(max(test_arr));
    }

    static int max(int[] arr){
        if (arr.length==0){
            return -1;
        }

        int max=arr[0];
        for (int i=0 ; i<arr.length ; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
