package com.sankir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class HashmapStudetns {

    public static void main(String[] args) {

        String[] ignitenames = {"Umar", "Supreeth", "Shashank", "Sindhu", "Pooja"};
        String[] propelnames = {"Varun", "Sharath", "Ganesh", "Manjunath", "Mallikarjun", "Akash"};
        String[] traineestudents = {"Chandana", "chandan", "varshini", "Priya", "Shivesh", "Bharath", "Spoorthi"};
        String[] internstudents = {"Amit", "Anusha", "Smaran", "Rohit", "Adithya", "Rohit", "Surabhi"};

        ArrayList<String> ignite = new ArrayList<>();
        ArrayList<String> propel = new ArrayList<>();
        ArrayList<String> trainee = new ArrayList<>();
        ArrayList<String> intern = new ArrayList<>();

        ignite.addAll(Arrays.asList(ignitenames));
        propel.addAll(Arrays.asList(propelnames));
        trainee.addAll(Arrays.asList(traineestudents));
        intern.addAll(Arrays.asList(internstudents));

        HashMap<Integer, ArrayList<String>> hashmapnames = new HashMap<>();

        hashmapnames.put(11, ignite);
        hashmapnames.put(255, propel);
        hashmapnames.put(355, trainee);
        hashmapnames.put(555, intern);


        hashmapnames.forEach((key, val) -> {
            System.out.println("Key: " + key);
            System.out.println("Value: " + val);
        });

        System.out.println();
        System.out.println("Ignite students: " + hashmapnames.get(11));
        System.out.println("Propel students: " + hashmapnames.get(255));
        System.out.println("Trainee students: " +hashmapnames.get(355));
        System.out.println("Interns: " + hashmapnames.get(555));
        System.out.println();

        Collections.sort(hashmapnames.get(11));
        System.out.println("The sorted arraylist: " + hashmapnames.get(11));

        System.out.println();
        System.out.println("Third element of ignite: " + hashmapnames.get(11).get(2));
        System.out.println("Second elemnt of propel: " + hashmapnames.get(255).get(1));

        System.out.println();
        System.out.println("Length and third characted of third element in ignite are:");
        System.out.println("Length: " + hashmapnames.get(11).get(2).length());
        System.out.println("Character: " + hashmapnames.get(11).get(2).charAt(0));
        System.out.println();






    }
}
