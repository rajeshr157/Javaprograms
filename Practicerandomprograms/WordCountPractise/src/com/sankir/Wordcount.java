package com.sankir;

import java.util.*;

public class Wordcount {

    public static void main(String[] args) {

        String[] names = {"Vishal Hiremath", "Umesh", "Smaran", "Shashi", "Yash", "Vishal", "Yash",
                "amith", "smaran", "Rahul", "Shashi", "Yash", "Yash", "smaran",
                "Vishal", "Umesh", "Smaran", "Shashi", "Yash", "Vishal", "Yash",
                "amith", "smaran", "Rahul", "Shashi", "Yash", "Yash", "smaran",
                "Vishal", "Umesh", "Smaran", "Shashi", "Yash", "Vishal", "Yash",
                "amith", "smaran", "Rahul", "Shashi", "Yash", "Yash", "smaran"};

        ArrayList<String> nameslist = new ArrayList<>();
        nameslist.addAll(Arrays.asList(names));

        System.out.println(nameslist);
        System.out.println();

        HashSet<String> nameshashset = new HashSet<String>(nameslist);

        System.out.println(nameshashset);
        System.out.println();

        ArrayList<Integer> countlist = new ArrayList<>();

        int count = 0;

        for (String val : nameshashset) {
            count = Collections.frequency(nameslist, val);
            countlist.add(count);
        }

        System.out.println("The word count of unique names in the list are: ");

        int index = 0;

        for (String val : nameshashset) {
            System.out.println(val + "-" + countlist.get(index));
            index++;
        }

        TreeSet<String> namestreeset = new TreeSet<>(nameslist);
        ArrayList<Integer> countlist2 = new ArrayList<>();

        System.out.println("The word count of unique names in alphabetical order: ");


        for (String val : namestreeset) {
            count = Collections.frequency(nameslist, val);
            countlist2.add(count);
        }

        index = 0;
        for (String val : namestreeset) {
            System.out.println(val + "-" + countlist2.get(index));
            index++;
        }

    }
}
