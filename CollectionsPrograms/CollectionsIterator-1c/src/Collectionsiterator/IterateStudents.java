package Collectionsiterator;


// Example to show usage of Arraylist, HashSet, TreeSet

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import java.util.*;

public class IterateStudents {

    public static void main(String args[]) {

        String[] sarr = {"Vishal", "Umesh", "Rohit", "Abhishek", "Smaran", "Shashi", "Yash", "Mahesh",
                "amith", "smaran", "Rahul", "Shashi", "Sudheep", "Yash", "Seema"};

        ArrayList<String> arrayListstudents = new ArrayList<>();
        arrayListstudents.addAll(Arrays.asList(sarr));

        System.out.println("Size of list is : " + arrayListstudents.size());
        System.out.println("Print Arraylist elements as is :");
        System.out.println(arrayListstudents);


        System.out.println();
        ListIterator itr = arrayListstudents.listIterator();

        System.out.println("Print Arraylist elements thru iterator:");
        while (itr.hasNext()) {   // points to the  element
            System.out.print(itr.next() + ", ");  // content of that element
        }
        System.out.println();

        System.out.println();
        System.out.println("Reset Iterator to begin of List and Print again in different format and then print in reverse order:");
         // re assign iterator again to beginning of the List
        itr = arrayListstudents.listIterator();

        System.out.println("First print in forward order: ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }
        System.out.println("\n");

        System.out.println("Now print in reverse order: ");
        while (itr.hasPrevious()) {
            System.out.print(itr.previous() + ", ");
        }
        System.out.println();



    }

}


