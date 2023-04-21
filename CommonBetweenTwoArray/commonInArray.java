package CommonBetweenTwoArray;

import java.util.ArrayList;

public class commonInArray {

    public static void main(String[] args) {

        //Create arraylist1
        ArrayList<String> list1 = new ArrayList<String>();
        //Add values in arraylist 1
            list1.add("hi");
            list1.add("how");
            list1.add("are");
            list1.add("you");
            //print list 1
        System.out.println("List 1: " + list1);

        //Create arraylist 2
        ArrayList<String> list2 = new ArrayList<String>();
        //Add values in arraylist 2
        list2.add("hi");
        list2.add("you");
        list2.add("there");
        //print list 2
        System.out.println("List 1: " + list2);

        //find common element
        list1.retainAll(list2);

        //print common
        System.out.println("Common elements: "
                + list1);


    }
}
