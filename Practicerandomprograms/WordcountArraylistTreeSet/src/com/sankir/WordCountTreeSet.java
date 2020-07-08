package com.sankir;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class WordCountTreeSet {

    public static void main(String[] args) {

        String lines = "";

        ArrayList<String> wordslist = new ArrayList<>();

        try {

            FileReader fr = new FileReader("F:\\Sankir\\Javaprograms\\Datasets\\BigData.txt");

            BufferedReader br = new BufferedReader(fr);

            while ((lines = br.readLine()) != null) {

                wordslist.addAll(Arrays.asList(lines.split(" ")));
            }

            TreeSet<String> wordstreeset = new TreeSet<>(wordslist);

            System.out.println("The number of words in the file is: " + wordslist.size());
            System.out.println();

            System.out.println("No. of unique words in the file is: " + wordstreeset.size());
            System.out.println();

            System.out.println("The unique words in the file and its count are: ");

            for (String val : wordstreeset) {
                System.out.println(val + " - " + Collections.frequency(wordslist, val));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
