package com.sankir;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        String currentline = "";
        ArrayList<String> lineslist = new ArrayList<>();

        try {

            FileReader fr = new FileReader("F:\\\\Sankir\\\\Javaprograms\\\\Datasets\\\\treesetstudent.csv");

            BufferedReader br = new BufferedReader(fr);

            while ((currentline = br.readLine()) != null) {
                lineslist.add(currentline);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();

        TreeSet<Student> studentrecords = new TreeSet<>();
        int duplicates = 0;
        System.out.println("The duplicate records are as follows: ");

        for (String s : lineslist) {
            String[] words = s.split(",");

            Student obj = new Student(Integer.parseInt(words[0]), words[1], Integer.parseInt(words[2]), Double.parseDouble(words[3]));
            //studentrecords.add(obj);

            if ((studentrecords.add(obj) == false)) {
                System.out.println(obj);
                duplicates++;
            }
        }
        System.out.println("No. of duplicates: " + duplicates);
        System.out.println();
        System.out.println("original size of input file: " + lineslist.size());
        System.out.println();
        System.out.println("Size of sorted list: " + studentrecords.size());
        System.out.println();
        System.out.println("Sorted list: " + studentrecords);
    }
}