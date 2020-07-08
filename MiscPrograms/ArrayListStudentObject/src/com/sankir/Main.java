package com.sankir;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> records = new ArrayList<>();

        String filepath = "F:\\Sankir\\Javaprograms\\Datasets\\arrayliststudentmaxmin.csv";

        FileRead fr = new FileRead();

        int count = 0;

        String[] linesarray = fr.readFile(filepath).split("\n");

        for (String s : linesarray) {
            String words[] = s.split(",");

            Student sobj = new Student(Integer.parseInt(words[0]), words[1], Integer.parseInt(words[2]), Double.parseDouble(words[3]));
            records.add(sobj);
            count++;
        }
        records.forEach(i -> {
            System.out.println(i);
        });

        System.out.println();
        System.out.println("Records count: " + records.size());

        System.out.println("First name Alphabetically: " + Collections.min(records, Comparator.comparing(Student::getName)));
        System.out.println("Last name alphabetically: " + Collections.max(records, Comparator.comparing(Student::getName)));

        System.out.println();

        System.out.println("Max age: " + Collections.max(records, Comparator.comparingInt(Student::getAge)));
        System.out.println("Min age: " + Collections.min(records, Comparator.comparingInt(Student::getAge)));

        System.out.println();

        System.out.println("Max. roll No.: " + Collections.max(records, Comparator.comparingInt(Student::getRollno)));
        System.out.println("Min. roll No.: " + Collections.min(records, Comparator.comparingInt(Student::getRollno)));

        System.out.println();

        System.out.println("Max marks: " + Collections.max(records, Comparator.comparingDouble(Student::getMarks)));
        System.out.println("Min marks: " + Collections.min(records, Comparator.comparingDouble(Student::getMarks)));

        System.out.println();

        Collections.reverse(records);

        System.out.println("Reversed records: ");

        records.forEach(i -> {
            System.out.println(i);
        });

        System.out.println();

        System.out.println();

        Collections.sort(records, Comparator.comparing(Student::getMarks));

        records.forEach(i ->{
            System.out.println(i);
        });

        System.out.println();
        System.out.println("Alphabetical order: ");
        Collections.sort(records,Comparator.comparing(Student::getName));
        records.forEach(i ->{
            System.out.println(i);
        });

        System.out.println();
        System.out.println("Increasing roll no.: ");
        Collections.sort(records, Comparator.comparingInt(Student::getRollno));
        records.forEach(i ->{
            System.out.println(i);
        });

        System.out.println();

        System.out.println("Increasing age: ");
        Collections.sort(records,Comparator.comparingInt(Student::getAge));
        records.forEach(i ->{
            System.out.println(i);
        });
    }
}
