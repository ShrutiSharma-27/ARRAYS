import java.util.*;

public class Array_List1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        String ans = "yes";
        while (Objects.equals(ans, "yes")){
            System.out.println("Enter element = ");
            list.add(input.nextInt());
            System.out.println("Want to add more (yes/no): ");
            ans = input.next();
          //  System.out.println("*"+ans+"*"); just to check sth
        }

        //output
        System.out.println("your list : "+list);
        System.out.println("enter index : ");
        int a=input.nextInt();
        System.out.println("element at index "+a+" is "+ list.get(a)); //get will fetch the element at passed index
    }
}
/*Internally what ArrayList do is that whenever the capacity is half full or full -> it creates new array with
 increased capacity (maybe double the earlier capacity) ->  and copies the element from older one to the new
 one -> deletes the old ArrayList */

//list.get() will give error if you are passing an index with no value allotted currently.