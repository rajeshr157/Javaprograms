package com.sankir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class IteratorList {

    public static void main(String[] args) {

        String[] names = {"Vishal", "Umesh", "Rohit", "Abhishek", "Smaran", "Shashi", "Yash", "Mahesh",
                "amith", "smaran", "Rahul", "Shashi", "Sudheep", "Yash", "Seema"};

        ArrayList<String> nameslist = new ArrayList<>();
        nameslist.addAll(Arrays.asList(names));

        System.out.println("Size of array list is: " + nameslist.size());

        System.out.println("List of names in the list: " + nameslist);

        System.out.println();
        System.out.println("List Iterators: ");

        ListIterator litr = nameslist.listIterator();

        while (litr.hasNext()) {
            System.out.println(litr.next() + ", ");
        }

        System.out.println();

        litr = nameslist.listIterator();

        System.out.println("Forward list iterator: ");

        while (litr.hasNext()){
            System.out.println(litr.next() + ", ");
        }

        System.out.println();
        System.out.println("Revrese list iterator: ");
        while (litr.hasPrevious()){
            System.out.println(litr.previous());
        }

    }
}
