package RemoveDupliactefromArrayList;

import java.util.ArrayList;
import java.util.Arrays;

import static RemoveDupliactefromArrayList.main.removeDuplicate;

public class Runner {

    public static void main(String[] args){

        //get an arraylist with duplicate integer
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,3,2,5,6,5));

        //print the duplicate array
        System.out.println("Arraylist with duplicate values " + list);

        //remove duplicates
        ArrayList<Integer> newList = removeDuplicate(list);

        //print the arraylist with duplicates removed
        System.out.println("Array list with duplicate removes " + newList);

    }
}
