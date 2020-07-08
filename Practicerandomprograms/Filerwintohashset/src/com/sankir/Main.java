package com.sankir;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {


        String currentline = "";
        ArrayList<String> lineslist = new ArrayList<>();

        try {

            FileReader fr = new FileReader("F:\\Sankir\\Javaprograms\\Datasets\\hashsetstudent.csv");

            BufferedReader br = new BufferedReader(fr);

            while ((currentline = br.readLine()) != null) {
                lineslist.add(currentline);

            }

            br.close();
            fr.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("size of array list: " + lineslist.size());
        System.out.println("Arraylist is: " + lineslist);

        System.out.println();

        int duplicates = 0;
        HashSet<Student> nameshash = new HashSet<>();

        System.out.println("The duplicates are: ");

        for (String s : lineslist) {
            String[] words = s.split(",");
            Student sobj = new Student(Integer.parseInt(words[0]), words[1], Integer.parseInt(words[2]));

            if (nameshash.add(sobj) == false) {
                duplicates++;
                System.out.println(sobj);
            }
        }

        System.out.println();

        System.out.println("Original size of dataset: " + lineslist.size());
        System.out.println();
        System.out.println("No. of duplicates: " + duplicates);
        System.out.println("Size of hashset: " + nameshash.size());
        System.out.println();
        System.out.println("Hashset is: ");
        System.out.println(nameshash);
    }
}
