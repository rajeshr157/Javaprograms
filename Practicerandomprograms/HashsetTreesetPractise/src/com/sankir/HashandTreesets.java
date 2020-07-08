package com.sankir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class HashandTreesets {

    public static void main(String[] args) {

        String[] names = {"Vishal", "Umesh", "Smaran", "Shashi", "Mahesh", "Yash", "amith",
                "Vishal", "Rahul", "smaran", "Shashi", "Sudheep", "Yash", "Seema",
                "Vishal", "Umesh", "Smaran", "Shashank", "Ramesh", "Yash", "amith",
                "Vishal", "vishal", "Rahul", "Shashi", "Shashi", "Shashank", "Yash", "Seema"};

        ArrayList<String> nameslist = new ArrayList<>();
        nameslist.addAll(Arrays.asList(names));

        System.out.println(nameslist);
        System.out.println("Size: " + nameslist.size());
        System.out.println();

        HashSet<String> nameshash = new HashSet<>();
        nameshash.addAll(Arrays.asList(names));

        System.out.println("Hashset-names: ");
        System.out.println(nameshash);
        System.out.println("Size of Hashset: " + nameshash.size());

        int duplicates = 0;
        HashSet<String> nameshash2 = new HashSet<>();
        for (String values : names) {
            if ((nameshash2.add(values)) != true)
                duplicates++;
        }

        System.out.println("Duplicates: " + duplicates);

        TreeSet<String> namestree = new TreeSet<>(nameslist);
        System.out.println();
        System.out.println(namestree);
        System.out.println(namestree.size());

        TreeSet<String> namestree2 = new TreeSet<>();

        System.out.println();

        int treeduplicates = 0;
        for (String values : nameslist ){
            if((namestree2.add(values))!=true)
                treeduplicates++;
        }

        System.out.println("Tree set duplicates: " + treeduplicates);
    }
}
