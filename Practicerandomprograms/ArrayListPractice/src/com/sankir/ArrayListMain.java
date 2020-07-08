package com.sankir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMain {

    public static void main(String[] args) {

        String[] namelist = {"Rajesh", "Ramesh", "Suresh", "Umesh", "Smaran", "Shashi", "Yash", "Mahesh", "Yash", "amith", "smaran", "Rahul",
                "Shashi", "Sudheep", "Yash", "Seema"};

        ArrayList<String> arrayliststudents = new ArrayList<>();

        arrayliststudents.addAll(Arrays.asList(namelist));

        //ArrayList<String> arrayliststudents = new ArrayList<>(Arrays.asList(namelist));


        arrayliststudents.forEach(i -> System.out.print(i + ", "));
        System.out.println();

        System.out.println("Size of Array list: " + arrayliststudents.size());

        System.out.println();

        arrayliststudents.forEach(in -> System.out.println(in + ", Length - " + in.length()));

        System.out.println(arrayliststudents);
        System.out.println();
        System.out.println("The First and Last names: ");
        String first = Collections.min(arrayliststudents);
        String last = Collections.max(arrayliststudents);

        System.out.println("The first name is: " + first);
        System.out.println("The last name is: " + last);

        System.out.println();

        arrayliststudents.remove("Shashi");
        System.out.println("Updated length of arraylist after removal is: " + arrayliststudents.size());

        arrayliststudents.set(0, "Joy");
        System.out.println("Updated arraylist: ");
        System.out.println(arrayliststudents);

        System.out.println();
        arrayliststudents.add("Rajesh");
        arrayliststudents.add(0, "Swetha");
        arrayliststudents.add(arrayliststudents.size(), "Sam");
        arrayliststudents.add(5, "Kiran");

        System.out.println();
        System.out.println("updated Array List: " + arrayliststudents);
        System.out.println("Size of updated list: " + arrayliststudents.size());
        System.out.println();

        Collections.sort(arrayliststudents);
        System.out.println("The sorted array list; " + arrayliststudents);

        System.out.println();

        Collections.reverse(arrayliststudents);
        System.out.println("The reversed array list: " + arrayliststudents);
        System.out.println();

        Collections.shuffle(arrayliststudents);
        System.out.println("The shuffled array list: " + arrayliststudents);


    }
}
