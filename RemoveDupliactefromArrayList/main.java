package RemoveDupliactefromArrayList;

import java.util.ArrayList;
import java.util.*;

public class main {

    public static ArrayList<Integer> removeDuplicate(ArrayList<Integer> list) {

        //create new arrayList
        ArrayList<Integer> newList = new ArrayList<Integer>();

        //Transverse through first list
        //if element is not present in new list then add it
        for (Integer element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        //return statement
        return newList;
    }
}
