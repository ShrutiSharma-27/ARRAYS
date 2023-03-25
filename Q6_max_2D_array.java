public class Q6_max_2D_array {
    public static void main(String[] args) {
        int[][] test_arr= {{100,102,300},
                {2,4,8,90,301},
                {1,88,23},
                {3,2}};
        int result = max_2d(test_arr);

        System.out.println("max : "+result);
    }
    static int max_2d(int[][] arr){
        if (arr.length==0){
            return -1;
        }

        int max=arr[0][0]; //can also do : int max=Integer.MIN_VALUE;
        for (int[] row: arr){
            for (int ele : row)
                if (ele > max) max=ele;
        }
        return max ;
    }
}
