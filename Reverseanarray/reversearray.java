package Reverseanarray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class reversearray {

    public static void main (String[] args){

        //Creating an Array list obj
        ArrayList<Integer> myList = new ArrayList<Integer>();

        //Adding element to the array list
            myList.add(1);
            myList.add(2);
            myList.add(3);
            myList.add(4);
            myList.add(5);

        //Displaying ArrayList Before Reverse
         System.out.println("Before Reverse ArrayList:");
         System.out.println(myList);

         //*Reversing the list using Collections.reverse() method
            Collections.reverse(myList);

        //Displaying ArrayList after Reverse
            System.out.println("after Reverse ArrayList:");
            System.out.println(myList);


    }
    }


