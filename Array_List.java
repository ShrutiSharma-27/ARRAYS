import java.util.ArrayList;

/* ArrayList is a class
* Similar to vectors in C++
* used when you don't know the certain size of an array while creating it
* you want java to handle the size aspects */

//Collection Framework : java provides implementation of several data structures
//such as stacks, linked lists, maps, hashmaps in collection framework

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        /*
        can also write as
        ArrayList<Integer> list = new ArrayList<Integer>();
        within '<>' you can only add wrapper class and not any primitive
        */

        list.add(2);
        list.add(12);
        list.add(912);
        list.add(98);
        list.add(0);
        list.add(102);   //initial capacity was 5 but we're able to add 6 elements !

        System.out.println(list);

        //Functions :

        System.out.println(list.contains(0)); //gives true if it is present.

        list.set(0, 999); //will set 0th index's value as 999
        System.out.println(list);

        list.remove(2); //element at 0th index get removed
        System.out.println(list);
    }
}
